package com.uniajc.controlador;

import com.uniajc.modelo.Estudiante;
import com.uniajc.vista.VistaEstudiante;

public class ControladorEstudiante {

    private VistaEstudiante vista;
    private Estudiante modelo;

    public ControladorEstudiante(VistaEstudiante vista, Estudiante modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    public String getNombre() {
        return modelo.getNombre();
    }

    public void setNombre(String nombre) {
        modelo.setNombre(nombre);;
    }

    public int getEdad() {
        return modelo.getEdad();
    }

    public void setEdad(int edad) {
        modelo.setEdad(edad);;
    }
    
    public void actualizarVista(){
        vista.mostrarDetallesEstudiante(modelo);
    }
    

}
