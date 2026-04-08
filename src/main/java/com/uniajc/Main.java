package com.uniajc;

import java.sql.Connection;

import com.uniajc.config.ConexionPostgresDatabase;

// import com.uniajc.controlador.ControladorEstudiante;
// import com.uniajc.modelo.Estudiante;
// import com.uniajc.vista.VistaEstudiante;

public class Main {
    public static void main(String[] args) {
        System.out.println("Practica MVC - Uniajc!");

        Connection conexion = ConexionPostgresDatabase.getConnection();

        System.out.println("Conexión obtenida: " + (conexion != null ? "Exitosa" : "Fallida"));

        ConexionPostgresDatabase.closeConnection();

        // // Creando un estudiante desde su modelo
        // Estudiante estudiante = new Estudiante(1, "Juan Perez", 20);

        // // Creando la vista de estudiante
        // VistaEstudiante vista = new VistaEstudiante();

        // // Creando el controlador de estudiante y vinculándolo con la vista y el modelo
        // ControladorEstudiante controlador = new ControladorEstudiante(vista, estudiante);

        // // Mostrando los detalles del estudiante a través del controlador
        // // controlador.actualizarVista();

        // // Actualizando los datos del estudiante a través del controlador
        // // controlador.setNombre("Maria Gomez");
        // // controlador.setEdad(22);

        // // Actualizando la vista con los nuevos datos
        // // controlador.actualizarVista();


        // // Probar funcionalidades CRUD adicionales

        // // Crear un nuevo estudiante
        // Estudiante estudiante1 = new Estudiante(1, "Juan Perez", 20);
        // Estudiante estudiante2 = new Estudiante(2, "Ana Martinez", 21);
        // Estudiante estudiante3 = new Estudiante(3, "Carlos Lopez", 19);

        // controlador.agregarEstudiante(estudiante1);
        // controlador.agregarEstudiante(estudiante2);
        // controlador.agregarEstudiante(estudiante3);

        // // Mostrar todos los estudiantes
        // controlador.mostrarTodosLosEstudiantes();

        // // Actualizar un estudiante
        // controlador.actualizarEstudiante(2, "Ana Martinez Gomez", 22);

        // // Mostrar todos los estudiantes
        // controlador.mostrarTodosLosEstudiantes();

        // // Eliminar un estudiante
        // controlador.eliminarEstudiante(1);

        // // Mostrar todos los estudiantes        controlador.mostrarTodosLosEstudiantes();
        // controlador.mostrarTodosLosEstudiantes();

        // // Obtener un estudiante por su ID
        // Estudiante estudianteObtenido = controlador.obtenerEstudiantePorId(3);
        // if (estudianteObtenido != null) {
        //     System.out.println("Estudiante encontrado: " + estudianteObtenido.getNombre());
        // } else {        
        //     System.out.println("Estudiante no encontrado");
        // }
    }
}