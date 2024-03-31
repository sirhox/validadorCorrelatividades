package org.example;

import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> materiasCorrelativas;

    public Materia(String nombre, List<Materia> materiasCorrelativas) {
        this.nombre = nombre;
        this.materiasCorrelativas = materiasCorrelativas;
    }

    public boolean puedeCursar(Alumno alumno) {
        for (Materia materiaCorrelativa : materiasCorrelativas) {
            if (!alumno.aproboMateria(materiaCorrelativa)) {
                return false;
            }
        }
        return true;
    }

}
