package com.uniajc.modelo;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {

    private List<Estudiante> estudiantes;
    private int id;
    private String nombre;
    private int edad;

    public Estudiante(){}

    public Estudiante(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.estudiantes = new ArrayList<Estudiante>(); // Inicializamos la lista de estudiantes
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Metodo Create para agregar un nuevo estudiante a la lista
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
        System.out.println("Estudiante agregado: " + estudiante.getNombre());
    }

    // Metodo Read para obtener un estudiante
    public Estudiante obtenerEstudianteID(int id){
        for (Estudiante estudiante : estudiantes){
            if (estudiante.getId() == id){
                return estudiante;
            }
        }
        return null; // Retorna null si no encuentra el estudiante
    }

    // Metodo update para actualizar los datos de un estudiante existente
    public void actualizarEstudiante(int id, String nuevoNombre, int nuevaEdad) {
        Estudiante estudiante = obtenerEstudianteID(id);
        if (estudiante != null) {
            estudiante.setNombre(nuevoNombre);
            estudiante.setEdad(nuevaEdad);
        }
    }

    // Metodo Delete para eliminar un estudiante de la lista por su id
    public void eliminarEstudiante(int id) {
        Estudiante estudiante = obtenerEstudianteID(id);
        if (estudiante != null) {
            estudiantes.remove(estudiante);
        }
    }
    
    // Métodos para manejar la lista de estudiantes
    public List<Estudiante> getEstudiantes() {
        return this.estudiantes;
    }

}
