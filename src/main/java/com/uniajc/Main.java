package com.uniajc;


import com.uniajc.controlador.ControladorEstudiante;
import com.uniajc.modelo.Estudiante;
import com.uniajc.vista.VistaEstudiante;

public class Main {
    public static void main(String[] args) {
        System.out.println("Practica MVC - Uniajc!");

        // Creando un estudiante desde su modelo
        Estudiante estudiante = new Estudiante();

        // Creando la vista de estudiante
        VistaEstudiante vista = new VistaEstudiante();

        // Creando el controlador de estudiante y vinculándolo con la vista y el modelo
        ControladorEstudiante controlador = new ControladorEstudiante(vista, estudiante);

        // Mostrando los detalles del estudiante a través del controlador
        controlador.actualizarVista();

        // Actualizando los datos del estudiante a través del controlador
        controlador.setNombre("Maria Gomez");
        controlador.setEdad(22);

        // Actualizando la vista con los nuevos datos
        controlador.actualizarVista();

    }
}