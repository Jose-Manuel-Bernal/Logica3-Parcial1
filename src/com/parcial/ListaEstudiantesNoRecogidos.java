package com.parcial;

import java.util.ArrayList;
import java.util.List;

public class ListaEstudiantesNoRecogidos {

    private int cantidadEstudiantesNoRecogidos = 0;
    private List<Estudiante> estudiantesNoRecogidos = new ArrayList<>();

    public ListaEstudiantesNoRecogidos() {
    }

    public void agregar (Estudiante estudiante) {
        if (!estudiante.isRecogido()) {
            estudiantesNoRecogidos.add(estudiante);
            cantidadEstudiantesNoRecogidos++;
        }
    }

    public int getCantidadEstudiantesNoRecogidos() {
        return cantidadEstudiantesNoRecogidos;
    }

    public List<Estudiante> getEstudiantesNoRecogidos() {
        return estudiantesNoRecogidos;
    }

    @Override
    public String toString() {
        return "Lista de estudiantes no recogidos { " +
                "Cantidad = " + cantidadEstudiantesNoRecogidos +
                ", Estudiantes = " + estudiantesNoRecogidos + "}";
    }
}
