SELECT D.Nombre AS NombreDoctor, COUNT(DISTINCT C.Paciente_ID) AS CantidadPacientes
FROM Doctores D
LEFT JOIN Citas C ON D.ID = C.Doctor_ID
GROUP BY D.ID, D.Nombre
ORDER BY CantidadPacientes DESC;