package com.uniajc.vista;

import java.util.List;

import com.uniajc.modelo.Estudiante;

public class VistaEstudiante {

    // La manera sencilla de mostrar los detalles de un estudiante es a través de un método que reciba un objeto Estudiante y acceda a sus propiedades para mostrarlas. Aquí te dejo un ejemplo de cómo podrías implementar esto:
    public void mostrarDetallesEstudiante(Estudiante estudiante) {
        System.out.println("ID: " + estudiante.getId() + ", Nombre: " + estudiante.getNombre() + ", Edad: " + estudiante.getEdad());
    }

    public void mostrarTodosLosEstudiantes(List<Estudiante> estudiantes) {
        System.out.println("------");
        System.out.println("Lista de Estudiantes:");
        System.out.println("------");
        for (Estudiante estudiante : estudiantes) {
            mostrarDetallesEstudiante(estudiante);
        }
    }

}
