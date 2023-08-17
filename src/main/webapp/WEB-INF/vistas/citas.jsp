<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="navbar.jsp"%>
<title>Historia Clínica List</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	
<link rel="stylesheet" type="text/css" href="/final/res/css/estilos.css">

</head>
<body>

	<div class="container mt-5">
		<h1>Citas</h1>

    

    <!-- Tabla para listar citas -->
    <table class="table mt-3">
        <thead class="thead-dark">
            <tr>
                <th>ID</th>
                <th>Fecha</th>
             
                <th>Acciones</th>
            </tr>
        </thead>
        <tbody id="citasTableBody">
            <!-- Datos de las citas serán agregados aquí -->
        </tbody>
    </table>
</div>

<script>
    // Cargar citas al cargar la página
    $(document).ready(function() {
        loadCitas();

        // Enviar formulario para agregar o actualizar citas
        $("#citasForm").submit(function(event) {
            event.preventDefault();
            var formData = $(this).serialize();
            
            $.ajax({
                url: "/final/api/Citas",
                type: "POST",
                data: formData,
                success: function(response) {
                    loadCitas(); // Recargar la tabla
                    $("#citasForm")[0].reset(); // Limpiar formulario
                },
                error: function(error) {
                    console.error("Error al agregar/actualizar cita", error);
                }
            });
        });
    });

    // Cargar y mostrar citas en la tabla
    function loadCitas() {
        $.ajax({
            url: "/final/api/Citas",
            type: "GET",
            dataType: "json",
            success: function(data) {
                $("#citasTableBody").empty();

                $.each(data, function(index, cita) {
                    var row = "<tr>";
                    row += "<td>" + cita.id + "</td>";
                    row += "<td>" + new Date(cita.fecha).toLocaleDateString() + "</td>";
                  
                    row += "<td><button type='button' class='btn btn-danger' onclick='deleteCita(" + cita.id + ")'>Eliminar</button></td>";
                    row += "</tr>";
                    $("#citasTableBody").append(row);
                });
            },
            error: function() {
                console.log("Error al cargar citas.");
            }
        });
    }

    // Eliminar cita
    function deleteCita(id) {
        $.ajax({
            url: "/final/api/Citas/" + id,
            type: "DELETE",
            success: function(response) {
                loadCitas(); // Recargar la tabla
            },
            error: function(error) {
                console.error("Error al eliminar cita", error);
            }
        });
    }
</script>

<%@ include file='footer.jsp'%>
</body>
</html>
