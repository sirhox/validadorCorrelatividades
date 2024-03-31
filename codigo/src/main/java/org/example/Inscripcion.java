package org.example;

import java.util.List;

public class Inscripcion {
    private List<Materia> materias;
    private Alumno alumnoAInscribirse;

    public Inscripcion(List<Materia> materias, Alumno alumnoAInscribirse) {
        this.materias = materias;
        this.alumnoAInscribirse = alumnoAInscribirse;
    }

    public boolean aprobada(){
        //Si la inscripcion esta vacia, no esta aprobada
        if (materias.isEmpty()) {
            return false;
        }
        // Si el alumno no puede cursar alguna materia, la inscripcion no esta aprobada
        for (Materia materia : materias) {
            if (!materia.puedeCursar(alumnoAInscribirse)) {
                return false;
            }
        }
        return true;
    }
}
