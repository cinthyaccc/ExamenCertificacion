<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <%@ include file="navbar.jsp" %>
    <title>Lista de Pacientes</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="/final/res/css/estilos.css">
</head>
<body>
    <div class="container mt-5">
        <h1>Pacientes</h1>
        <table class="table mt-3">
            <thead class="thead-dark">
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Fecha de Nacimiento</th>
                    <th>Edad</th>
                </tr>
            </thead>
            <tbody id="pacientesTableBody">
                <!-- Datos de los pacientes serán agregados aquí -->
            </tbody>
        </table>
    </div>

    <script>
        $(document).ready(function() {
            loadPacientes();
        });

        function loadPacientes() {
            $.ajax({
                url: "/final/api/pacientes", // Ajusta la URL según tu configuración
                type: "GET",
                dataType: "json",
                success: function(data) {
                    $("#pacientesTableBody").empty();

                    $.each(data, function(index, paciente) {
                        var row = "<tr>";
                        row += "<td>" + paciente.id + "</td>";
                        row += "<td>" + paciente.nombre + "</td>";
                        row += "<td>" + new Date(paciente.fechaNacimiento).toLocaleDateString() + "</td>";
                        row += "<td>" + paciente.edad + "</td>";
                        row += "</tr>";
                        $("#pacientesTableBody").append(row);
                    });
                },
                error: function() {
                    console.log("Error al cargar pacientes.");
                }
            });
        }
    </script>

    <%@ include file="footer.jsp" %>
</body>
</html>
