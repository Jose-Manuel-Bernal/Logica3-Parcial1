package com.parcial;

import java.util.ArrayList;
import java.util.List;

public class ListaEstudiatesRecogidosEnlaParadaIncorrecta {

    private int cantidadEstudiantes = 0;
    private List<Estudiante> lista = new ArrayList<>();

    public ListaEstudiatesRecogidosEnlaParadaIncorrecta() {}

    public void agregar (Estudiante estudiante, int paradaDondeFueRecogido) {
        if (estudiante.getParadaDondeDebeSubirse() != paradaDondeFueRecogido) {
            lista.add(estudiante);
            cantidadEstudiantes++;
        }
    }

    public int getCantidadEstudiantes() {
        return cantidadEstudiantes;
    }

    public List<Estudiante> getLista() {
        return lista;
    }

    @Override
    public String toString() {
        return "Lista de estudiates recogidos en la parada incorrecta { " +
                " Cantidad = " + cantidadEstudiantes +
                ", Estudiantes = " + lista +
                '}';
    }
}
