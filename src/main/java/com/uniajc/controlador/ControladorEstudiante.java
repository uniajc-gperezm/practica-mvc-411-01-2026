package com.uniajc.controlador;

import java.util.List;
import com.uniajc.modelo.Estudiante;
import com.uniajc.vista.VistaEstudiante;

public class ControladorEstudiante {

    
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
        estudiante.setNombre(nombre);
    }

    public int getEdad() {
        return estudiante.getEdad();
    }

    public void setEdad(int edad) {
        estudiante.setEdad(edad);
    }

    public List<Estudiante> getEstudiantes() {
        return estudiante.getEstudiantes();
    }

    public void agregarEstudiante(Estudiante nuevoEstudiante) {
        estudiante.agregarEstudiante(nuevoEstudiante);
    }

    public void actualizarEstudiante(int id, String nuevoNombre, int nuevaEdad) {
        estudiante.actualizarEstudiante(id, nuevoNombre, nuevaEdad);
    }

    public Estudiante obtenerEstudiantePorId(int id) {
        return estudiante.obtenerEstudianteID(id);
    }

    public void eliminarEstudiante(int id) {
        estudiante.eliminarEstudiante(id);
    }

    public void actualizarVista() {
        vista.mostrarDetallesEstudiante(estudiante);
    }

    public void mostrarTodosLosEstudiantes() {
        vista.mostrarTodosLosEstudiantes(estudiante.getEstudiantes());
    }

}
