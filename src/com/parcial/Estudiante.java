package com.parcial;

import java.util.Objects;

public class Estudiante {
    private String nombre;
    private int paradaDondeDebeSubirse;
    private boolean recogido = false;

    public Estudiante(String nombre, int paradaDondeDebeSubirse) {
        this.nombre = nombre;
        this.paradaDondeDebeSubirse = paradaDondeDebeSubirse;
    }

    public String getNombre() {
        return nombre;
    }

    public int getParadaDondeDebeSubirse() {
        return paradaDondeDebeSubirse;
    }

    public boolean isRecogido() {
        return recogido;
    }

    public void setRecogido(boolean recogido) {
        this.recogido = recogido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estudiante that = (Estudiante) o;
        return paradaDondeDebeSubirse == that.paradaDondeDebeSubirse && nombre.equals(that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, paradaDondeDebeSubirse);
    }

    @Override
    public String toString() {
        return  " nombre = " + nombre +
                " - paradaDondeDebeSubirse = " + paradaDondeDebeSubirse + " ";
    }
}
