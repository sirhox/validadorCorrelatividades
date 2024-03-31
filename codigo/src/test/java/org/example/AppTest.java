package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.Arrays;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{

    public void testAprobada() {
        //Se quiere anotar a matematica2 teniendo aprobada matematica
        Materia matematica = new Materia("Matematica", null);
        Materia matematica2 = new Materia("Matematica2", Arrays.asList(matematica));
        Alumno alumno = new Alumno("Juan", Arrays.asList(matematica));
        Inscripcion inscripcion = new Inscripcion(Arrays.asList(matematica2), alumno);
        assertTrue(inscripcion.aprobada());
    }
    public void testNoAprobada() {
        //No tiene aprobada matematica y se quiere anotar a matematica2
        Materia matematica = new Materia("Matematica", null);
        Materia matematica2 = new Materia("Matematica2", Arrays.asList(matematica));
        Alumno alumno = new Alumno("Juan", Arrays.asList());
        Inscripcion inscripcion = new Inscripcion(Arrays.asList(matematica2), alumno);
        assertFalse(inscripcion.aprobada());
    }
    public void testInscripcionVacia() {
        //Inscripcion vacia
        Materia matematica = new Materia("Matematica", null);
        Alumno alumno = new Alumno("Juan", Arrays.asList());
        Inscripcion inscripcion = new Inscripcion(Arrays.asList(), alumno);
        assertFalse(inscripcion.aprobada());
    }

}
