SELECT P.Nombre AS NombrePaciente, D.Nombre AS NombreDoctor
FROM Citas C
JOIN Pacientes P ON C.Paciente_ID = P.ID
JOIN Doctores D ON C.Doctor_ID = D.ID;