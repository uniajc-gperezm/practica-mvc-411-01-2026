package com.uniajc.vista;

import java.util.List;

import com.uniajc.modelo.Estudiante;

public class VistaEstudiante {

    // La manera sencilla de mostrar los detalles de un estudiante atraves de un metodo que reciba un objeto
    //public void mostrarDetallesEstudiante(String nombre, int edad){
    //    System.out.println("nombre: " + nombre);
    //    System.out.println("Edad: " + edad);
    //}

    public void mostrarDetallesEstudiante(Estudiante estudiante){
        System.out.println("Nombre: " + estudiante.getNombre() + ", Edad: " + estudiante.getEdad());

    }

    public void mostrarTodosEstudiantes(List<Estudiante> estudiantes){
        System.out.println("Lista de Estudiantes: ");
        for (Estudiante estudiante : estudiantes){
            mostrarDetallesEstudiante(estudiante);
        }
    }
}
