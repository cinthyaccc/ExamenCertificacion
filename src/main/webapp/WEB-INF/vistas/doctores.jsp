<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <%@ include file="navbar.jsp" %>
    <title>Lista de Doctores</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="/final/res/css/estilos.css">
</head>
<body>
    <div class="container mt-5">
        <h1>Doctores</h1>
        <table class="table mt-3">
            <thead class="thead-dark">
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Experiencia (años)</th>
                </tr>
            </thead>
            <tbody id="doctoresTableBody">
                <!-- Datos de los doctores serán agregados aquí -->
            </tbody>
        </table>
    </div>

    <script>
        $(document).ready(function() {
            loadDoctores();
        });

        function loadDoctores() {
            $.ajax({
                url: "/final/api/doctores", // Ajusta la URL según tu configuración
                type: "GET",
                dataType: "json",
                success: function(data) {
                    $("#doctoresTableBody").empty();

                    $.each(data, function(index, doctor) {
                        var row = "<tr>";
                        row += "<td>" + doctor.id + "</td>";
                        row += "<td>" + doctor.nombre + "</td>";
                        row += "<td>" + doctor.experiencia + "</td>";
                        row += "</tr>";
                        $("#doctoresTableBody").append(row);
                    });
                },
                error: function() {
                    console.log("Error al cargar doctores.");
                }
            });
        }
    </script>

    <%@ include file="footer.jsp" %>
</body>
</html>
