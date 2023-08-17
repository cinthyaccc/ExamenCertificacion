<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <%@ include file="navbar.jsp" %>
    <title>Lista de Facturas</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="/final/res/css/estilos.css">
</head>
<body>
    <div class="container mt-5">
        <h1>Facturas</h1>
        <table class="table mt-3">
            <thead class="thead-dark">
                <tr>
                    <th>ID</th>
                    <th>Monto</th>
                    <th>Fecha de Pago</th>
                </tr>
            </thead>
            <tbody id="facturasTableBody">
                <!-- Datos de las facturas serán agregados aquí -->
            </tbody>
        </table>
    </div>

    <script>
        $(document).ready(function() {
            loadFacturas();
        });

        function loadFacturas() {
            $.ajax({
                url: "/final/api/facturas", // Ajusta la URL según tu configuración
                type: "GET",
                dataType: "json",
                success: function(data) {
                    $("#facturasTableBody").empty();

                    $.each(data, function(index, factura) {
                        var row = "<tr>";
                        row += "<td>" + factura.id + "</td>";
                        row += "<td>" + factura.monto + "</td>";
                        row += "<td>" + (factura.fechaPago ? new Date(factura.fechaPago).toLocaleDateString() : "Pendiente") + "</td>";
                        row += "</tr>";
                        $("#facturasTableBody").append(row);
                    });
                },
                error: function() {
                    console.log("Error al cargar facturas.");
                }
            });
        }
    </script>

    <%@ include file="footer.jsp" %>
</body>
</html>
