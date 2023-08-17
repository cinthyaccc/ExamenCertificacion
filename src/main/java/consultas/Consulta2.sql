SELECT D.Nombre AS NombreDoctor, E.Nombre AS EspecialidadDoctor
FROM Pacientes P
JOIN Citas C ON P.ID = C.Paciente_ID
JOIN Doctores D ON C.Doctor_ID = D.ID
JOIN Especialidades E ON D.Especialidad_ID = E.ID
WHERE P.Nombre = 'Juan Pérez';