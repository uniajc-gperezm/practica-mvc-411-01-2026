package com.uniajc.controlador;

import java.util.List;
import com.uniajc.modelo.Estudiante;
import com.uniajc.vista.VistaEstudiante;

public class ControladorEstudiante {

    private List<Estudiante> estudiantes;
    private VistaEstudiante vista;
    private Estudiante estudiante;


    public ControladorEstudiante(VistaEstudiante vista, Estudiante estudiante) {
        this.vista = vista;
        this.estudiante = estudiante;
    }

    public String getNombre() {
        return estudiante.getNombre();
    }

    public void setNombre(String nombre) {
        estudiante.setNombre(nombre);;
    }

    public int getEdad() {
        return estudiante.getEdad();
    }

    public void setEdad(int edad) {
        estudiante.setEdad(edad);;
    }
    
    public void actualizarVista(){
        vista.mostrarDetallesEstudiante(estudiante);
    }
    

}
