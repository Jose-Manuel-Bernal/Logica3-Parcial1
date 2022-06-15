package com.parcial;

import java.util.ArrayList;
import java.util.List;

//Esta es la lista que sera dada al conductor antes de realizar el recorido
public class ListaDeEstudiantes {

    private List<Estudiante> lista = new ArrayList<>();
    private int cantidadEstudiantes =0;

    public ListaDeEstudiantes() {}

    public void agregarEstudiante (Estudiante estudiante)
    {
        lista.add(estudiante);
        cantidadEstudiantes++;
    }

    public List<Estudiante> getLista() {
        return lista;
    }

    public int getNumeroEstudiantes() {
        return cantidadEstudiantes;
    }

    @Override
    public String toString() {
        return "ListaDeEstudiantes{" +
                "lista=" + lista +
                '}';
    }
}
