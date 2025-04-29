
package com.caño.crud;/ Paquete que organiza la clase dentro de la estructura del proyecto

/**
 * Clase que representa la entidad Alumno en el sistema.
 * Contiene los atributos básicos de un alumno y métodos para acceder y modificar estos datos.
 */

public class Alumno {
    // Atributos privados que representan las propiedades de un alumno
    private int id;
    private String nombre;
    private int edad;
    private String curso;
/**
     * Constructor para crear una instancia de Alumno con todos sus atributos.
     * 
     * @param id     Identificador único del alumno
     * @param nombre Nombre completo del alumno
     * @param edad   Edad del alumno en años
     * @param curso  Curso o grado al que pertenece el alumno
     */
    public Alumno(int id, String nombre, int edad, String curso) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

     // Métodos getters para acceder a los atributos privados

    /**
     * @return El ID del alumno
     */
    public int getId() { return id; }
    /**
     * @return El nombre del alumno
     */
    public String getNombre() { return nombre; }
    /**
     * @return La edad del alumno
     */
    public int getEdad() { return edad; }
    /**
     * @return El curso del alumno
     */
    public String getCurso() { return curso; }

// Métodos setters para modificar los atributos privados

    /**
     * Establece un nuevo ID para el alumno
     * @param id El nuevo ID a asignar
     */
    public void setId(int id) { this.id = id; }
    /**
     * Establece un nuevo nombre para el alumno
     * @param nombre El nuevo nombre a asignar
     */
    public void setNombre(String nombre) { this.nombre = nombre; }
    /**
     * Establece una nueva edad para el alumno
     * @param edad La nueva edad a asignar
     */
    public void setEdad(int edad) { this.edad = edad; }
     /**
     * Establece un nuevo curso para el alumno
     * @param curso El nuevo curso a asignar
     */
    public void setCurso(String curso) { this.curso = curso; }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad + ", Curso: " + curso;
    }
}
