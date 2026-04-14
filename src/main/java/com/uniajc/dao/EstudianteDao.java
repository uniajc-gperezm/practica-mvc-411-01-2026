package com.uniajc.dao;

import java.util.List;

import com.uniajc.modelo.Estudiante;

public class EstudianteDao {
    
    private List<Estudiante> estudiantes;

    public EstudianteDao(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    // Metodo Create para agregar un nuevo estudiante a la lista
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
        System.out.println("Estudiante agregado: " + estudiante.getNombre());
    }

    // Metodo Read para obtener un estudiante por su id
    public Estudiante obtenerEstudiantePorId(int id) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getId() == id) {
                return estudiante;
            }
        }
        return null; // Retorna null si no se encuentra el estudiante
    }

    // Metodo Update para actualizar los datos de un estudiante existente
    public void actualizarEstudiante(int id, String nuevoNombre, int nuevaEdad) {
        Estudiante estudiante = obtenerEstudiantePorId(id);
        if (estudiante != null) {
            estudiante.setNombre(nuevoNombre);
            estudiante.setEdad(nuevaEdad);
        }
    }
    
    // Metodo Delete para eliminar un estudiante de la lista por su id
    public void eliminarEstudiante(int id) {
        Estudiante estudiante = obtenerEstudiantePorId(id);
        if (estudiante != null) {
            estudiantes.remove(estudiante);
        }
    }
    
    // Métodos para manejar la lista de estudiantes
    public List<Estudiante> getEstudiantes() {
        return this.estudiantes;
    }

    
}
