
package lab6_diegozelaya;

import java.util.ArrayList;

public class claudiList {
    private String nombre;
    
    public claudiList() {
    }

    public claudiList(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "claudiList{" + "nombre=" + nombre + '}';
    }
    
}
