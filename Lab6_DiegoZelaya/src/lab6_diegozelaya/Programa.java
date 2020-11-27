
package lab6_diegozelaya;

import java.util.Date;

public class Programa {
    private String nombre;
    private int puntuacion;
    private int lanzamiento;
    private String tipo;
    private String genero;

    public Programa() {
    }

    public Programa(String nombre, int puntuacion, int lanzamiento, String tipo, String genero) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.lanzamiento = lanzamiento;
        this.tipo = tipo;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(int lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Programa{" + "nombre=" + nombre + ", puntuacion=" + puntuacion + ", lanzamiento=" + lanzamiento + ", tipo=" + tipo + ", genero=" + genero + '}';
    }
    
}
