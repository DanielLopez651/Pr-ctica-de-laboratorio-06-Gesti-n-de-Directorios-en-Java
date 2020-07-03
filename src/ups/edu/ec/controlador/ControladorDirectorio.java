/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.controlador;

import java.io.File;
import ups.edu.ec.vista.Ventana;
import ups.edu.ec.vista.VentanaPrincipal;

/**
 *
 * @author user
 */
public class ControladorDirectorio {

    private String ruta;
    private File archivo;
    private File[] archivos;
    private VentanaPrincipal ventanaPrincipal;
    private Ventana ventana;

    public ControladorDirectorio(VentanaPrincipal ventanaPrincipal,Ventana ventana) {
        this.ventanaPrincipal=ventanaPrincipal;
    }
    

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public File[] getArchivos() {
        return archivos;
    }

    public void setArchivos(File[] archivos) {
        this.archivos = archivos;
    }
    
    public void crearArchivo(String nombreDirectorio) {
        try {
            File ruta = new File(nombreDirectorio);
            if (ruta.exists() == false) {
                ruta.mkdir();
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    

}
