package com.escaño.crud;// Paquete que organiza la clase dentro de la estructura del proyecto
import java.util.*;// Importa clases de utilidad como Scanner y List
/**
 * Clase principal que implementa un menú interactivo en consola para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar)
 * sobre entidades de tipo Alumno. Utiliza AlumnoDAO para interactuar con la base de datos.
 */
public class CRUD {
/**
     * Método principal que inicia la aplicación y muestra el menú de opciones.
     * 
     * @param args Argumentos de línea de comandos (no utilizados en este caso)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// Scanner para leer la entrada del usuario
        AlumnoDAO dao = new AlumnoDAO();// Instancia de AlumnoDAO para manejar operaciones de base de datos

        while (true) {// Bucle infinito para mostrar el menú hasta que el usuario elija salir
            System.out.println("\nMENÚ DE OPCIONES CRUD");
            System.out.println("1. Insertar nuevo alumno");
            System.out.println("2. Listar todos los alumnos");
            System.out.println("3. Actualizar alumno existente");
            System.out.println("4. Eliminar alumno");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = sc.nextInt(); sc.nextLine();// Lee la opción del usuario y limpia el buffer

            try {// Manejo de excepciones para capturar errores durante las operaciones
                switch (opcion) {
                    case 1: // Insertar un nuevo alumno
                        System.out.print("ID: "); int id = sc.nextInt(); sc.nextLine();
                        System.out.print("Nombre: "); String nombre = sc.nextLine();
                        System.out.print("Edad: "); int edad = sc.nextInt(); sc.nextLine();
                        System.out.print("Curso: "); String curso = sc.nextLine();
                        dao.insertar(new Alumno(id, nombre, edad, curso));// Llama al método insertar de AlumnoDAO
                        System.out.println("Alumno insertado correctamente.");
                        break;
                    case 2:// Listar todos los alumnos
                        List<Alumno> alumnos = dao.obtenerTodos();// Obtiene la lista de alumnos desde la base de datos
                        if (alumnos.isEmpty())
                            System.out.println("No hay alumnos registrados.");
                        else
                            alumnos.forEach(System.out::println);
                        break;
                    case 3:// Actualizar un alumno existente
                        System.out.print("ID del alumno a actualizar: "); int idUpd = sc.nextInt(); sc.nextLine();
                        System.out.print("Nuevo nombre: "); String nomUpd = sc.nextLine();
                        System.out.print("Nueva edad: "); int edadUpd = sc.nextInt(); sc.nextLine();
                        System.out.print("Nuevo curso: "); String cursoUpd = sc.nextLine();
                        dao.actualizar(new Alumno(idUpd, nomUpd, edadUpd, cursoUpd));// Llama al método actualizar de AlumnoDAO
                        System.out.println("Alumno actualizado correctamente.");
                        break;
                    case 4:// Eliminar un alumno
                        System.out.print("ID a eliminar: "); int idDel = sc.nextInt();
                        dao.eliminar(idDel);// Llama al método eliminar de AlumnoDAO
                        System.out.println("Alumno eliminado correctamente.");
                        break;
                    case 5:// Salir del programa
                        System.out.println("Gracias por utilizar el sistema. ¡Hasta pronto!");
                        return;// Termina el método main y sale del programa
                    default:// Opción no válida
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                }
            } catch (Exception e) {// Captura cualquier excepción y muestra un mensaje de error
                System.out.println("Se ha producido un error: " + e.getMessage());
            }
        }
    }

                   
}

