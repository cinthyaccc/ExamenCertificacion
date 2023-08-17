SELECT P.Nombre AS NombrePaciente, HC.Diagnostico, HC.Tratamiento
FROM Pacientes P
JOIN Citas C ON P.ID = C.Paciente_ID
JOIN Historia_Clinica HC ON C.ID = HC.ID
WHERE C.ID = (
    SELECT MAX(ID)
    FROM Citas
    WHERE Paciente_ID = P.ID
)
ORDER BY P.ID ASC;