<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Historia Clínica List</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>

<h1>List of Historia Clínica</h1>

<table>
    <thead>
        <tr>
            <th>ID</th>
            <th>Paciente</th>
            <th>Fecha</th>
            <th>Diagnóstico</th>
            <th>Doctor</th>
        </tr>
    </thead>
    <tbody id="historiaClinicaTableBody">
        <!-- Historia Clínica data will be added here -->
    </tbody>
</table>

<script>
    $(document).ready(function() {
        $.ajax({
            url: "/api/HistoriaClinica",
            type: "GET",
            dataType: "json",
            success: function(data) {
                // Clear existing rows
                $("#historiaClinicaTableBody").empty();

                // Add rows for each historia clinica
                $.each(data, function(index, historiaClinica) {
                    var row = "<tr>";
                    row += "<td>" + historiaClinica.ID + "</td>";
                    row += "<td>" + historiaClinica.paciente + "</td>";
                    row += "<td>" + historiaClinica.fecha + "</td>";
                    row += "<td>" + historiaClinica.diagnostico + "</td>";
                    row += "<td>" + historiaClinica.doctor.nombre + "</td>";
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

</body>
</html>
