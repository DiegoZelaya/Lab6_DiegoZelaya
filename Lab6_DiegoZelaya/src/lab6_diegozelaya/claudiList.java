
package lab6_diegozelaya;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class claudiList {
    private ArrayList<Programa> programas = new ArrayList();
    private File archivo = null;

    public claudiList(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }
    
    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Programa> getProgramas() {
        return programas;
    }

    public void setProgramas(ArrayList<Programa> programas) {
        this.programas = programas;
    }

    @Override
    public String toString() {
        return "listaPersonas=" + programas;
    }

    //extra mutador
    public void setPrograma(Programa p) {
        this.programas.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Programa t : programas) {
                bw.write(t.getNombre() + "/");
                bw.write(t.getPuntuacion() + "/");
                bw.write(t.getLanzamiento() + "/");
                bw.write(t.getTipo() + "/");
                bw.write(t.getGenero() + "/");
            }
            bw.flush();
        } catch (Exception ex) {}
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        programas = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("/");
                while (sc.hasNext()) {
                    programas.add(new Programa(sc.next(),sc.nextInt(),sc.nextInt(),sc.next(),sc.next()));
                }
            } catch (Exception ex) {}
            sc.close();
        }//FIN IF
    }
}
