package com.parcial;

import java.util.ArrayList;
import java.util.List;

//esta es la lista que el conductor ira llenando a medida que recoge estudiantes
public class ListaRecorrido {

    private List<Registro> registros = new ArrayList<>();
    private int estudiantesRecogidos = 0;

    public ListaRecorrido() {
    }

    public void agregarRegistro (Registro registro) {
        registros.add(registro);
        registro.getEstudiante().setRecogido(true);
        estudiantesRecogidos++;
    }

    public List<Registro> getRegistros() {
        return registros;
    }

    public int getEstudiantesRecogidos() {
        return estudiantesRecogidos;
    }

    @Override
    public String toString() {
        return "Lista de estudiantes recogidos {" +
                " " + registros +
                ", estudiantesRecogidos = " + estudiantesRecogidos +
                '}';
    }
}
