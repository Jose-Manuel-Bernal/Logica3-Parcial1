package com.parcial;

public class Registro {

    private Estudiante estudiante;
    private int parada;

    public Registro() {}

    public Registro(Estudiante estudiante, int parada) {
        this.estudiante = estudiante;
        this.parada = parada;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public int getParada() {
        return parada;
    }

    public void setParada(int parada) {
        this.parada = parada;
    }

    @Override
    public String toString() {
        return " Registro {" + estudiante +
                ", parada donde fue recogido = " + parada +
                " } ";
    }
}
