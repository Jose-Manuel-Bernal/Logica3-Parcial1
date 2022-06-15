package com.parcial;

import java.util.ArrayList;
import java.util.List;

public class ListaEstudiantesRecogidosEnlaParadaCorrecta {

    private int cantidadEstudiantes = 0;
    private List<Estudiante> listaEstudiantes = new ArrayList<>();

    public ListaEstudiantesRecogidosEnlaParadaCorrecta() {
    }

    public void agregar (Estudiante estudiante, int paradaDondeFueRecogido) {
        if (paradaDondeFueRecogido == estudiante.getParadaDondeDebeSubirse()){
            listaEstudiantes.add(estudiante);
            cantidadEstudiantes++;
        }
    }

    public int getCantidadEstudiantes() {
        return cantidadEstudiantes;
    }

    public List<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    @Override
    public String toString() {

        if (cantidadEstudiantes == 0) {
            return "No hubo estudiantes recogidos en la parada correcta";
        }
        return "Estudiantes Recogidos En la Parada Correcta{" +
                " Cantidad = " + cantidadEstudiantes +
                ", Estudiantes = " + listaEstudiantes +
                '}';
    }
}
