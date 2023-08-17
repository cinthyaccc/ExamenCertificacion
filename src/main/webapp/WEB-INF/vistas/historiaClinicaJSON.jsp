<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<title>Historia Clínica List</title>
<%@ include file="navbar.jsp"%>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	
<link rel="stylesheet" type="text/css" href="/final/res/css/estilos.css">

</head>
<body>

	<div class="container mt-5">
		<h1>Historia Clínica</h1>

		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th>ID</th>
					<th>Fecha</th>
					<th>Síntomas</th>
					<th>Diagnóstico</th>
					<th>Tratamiento</th>
				</tr>
			</thead>
			<tbody id="historiaClinicaTableBody">
				<!-- Historia Clínica data will be added here -->
			</tbody>
		</table>
	</div>

	<script>
    $(document).ready(function() {
        $.ajax({
        	url: "/final/api/HistoriaClinica",
            type: "GET",
            dataType: "json",
            success: function(data) {
                // Clear existing rows
                $("#historiaClinicaTableBody").empty();

                // Add rows for each historia clinica
                $.each(data, function(index, historiaClinica) {
                    var row = "<tr>";
                    row += "<td>" + historiaClinica.id + "</td>";
                    row += "<td>" + new Date(historiaClinica.fecha).toLocaleDateString() + "</td>";
                    row += "<td>" + historiaClinica.sintomas + "</td>";
                    row += "<td>" + historiaClinica.diagnostico + "</td>";
                    row += "<td>" + historiaClinica.tratamiento + "</td>";
                    row += "</tr>";
                    $("#historiaClinicaTableBody").append(row);
                });
            },
            error: function() {
                console.log("Error fetching data.");
            }
        });
    });
</script>
<%@ include file='footer.jsp'%>
</body>
</html>
