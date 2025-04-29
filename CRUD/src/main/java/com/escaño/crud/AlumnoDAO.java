
package com.escaño.crud;// Paquete que organiza la clase dentro de la estructura del proyecto
import java.sql.*;// Importa clases para operaciones JDBC (Connection, PreparedStatement, ResultSet, SQLException)
import java.util.*;// Importa clases de utilidad como List y ArrayList

/**
 * Clase que implementa el patrón Data Access Object (DAO) para la entidad Alumno.
 * Proporciona métodos para realizar operaciones CRUD en la base de datos.
 */

public class AlumnoDAO {
/**
     * Inserta un nuevo alumno en la base de datos.
     * 
     * @param alumno El objeto Alumno que contiene los datos a insertar
     * @throws SQLException Si ocurre un error al acceder a la base de datos
     */
    public void insertar(Alumno alumno) throws SQLException {
        String sql = "INSERT INTO alumnos (id, nombre, edad, curso) VALUES (?, ?, ?, ?)";// Consulta SQL parametrizada
        try (Connection con = ConexionBD.conectar();// Obtiene conexión usando la clase ConexionBD
             PreparedStatement ps = con.prepareStatement(sql)) {// Prepara la sentencia SQL
                // Establece los parámetros de la consulta con los valores del alumno
            ps.setInt(1, alumno.getId());
            ps.setString(2, alumno.getNombre());
            ps.setInt(3, alumno.getEdad());
            ps.setString(4, alumno.getCurso());
            ps.executeUpdate();// Ejecuta la inserción
        }// Los recursos Connection y PreparedStatement se cierran automáticamente gracias al try-with-resources
    }
/**
     * Obtiene todos los alumnos registrados en la base de datos.
     * 
     * @return Lista de objetos Alumno
     * @throws SQLException Si ocurre un error al acceder a la base de datos
     */
    public List<Alumno> obtenerTodos() throws SQLException {
        List<Alumno> lista = new ArrayList<>();// Lista para almacenar los resultados
        String sql = "SELECT * FROM alumnos";
        try (Connection con = ConexionBD.conectar();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {// Ejecuta la consulta y obtiene el ResultSet
            while (rs.next()) {// Itera sobre cada fila del resultado
                // Crea un objeto Alumno con los datos de cada fila y lo añade a la lista
                Alumno a = new Alumno(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getInt("edad"),
                    rs.getString("curso")
                );
                lista.add(a);
            }
        }
        return lista;// Devuelve la lista de alumnos
    }
/**
     * Actualiza los datos de un alumno existente en la base de datos.
     * 
     * @param alumno El objeto Alumno con los datos actualizados
     * @throws SQLException Si ocurre un error al acceder a la base de datos
     */
    public void actualizar(Alumno alumno) throws SQLException {
        String sql = "UPDATE alumnos SET nombre = ?, edad = ?, curso = ? WHERE id = ?";// Consulta SQL de actualización
        try (Connection con = ConexionBD.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, alumno.getNombre());
            ps.setInt(2, alumno.getEdad());
            ps.setString(3, alumno.getCurso());
            ps.setInt(4, alumno.getId());
            ps.executeUpdate();// Ejecuta la actualización
        }
    }
/**
     * Elimina un alumno de la base de datos según su ID.
     * 
     * @param id El ID del alumno a eliminar
     * @throws SQLException Si ocurre un error al acceder a la base de datos
     */
    public void eliminar(int id) throws SQLException {
        String sql = "DELETE FROM alumnos WHERE id = ?";// Consulta SQL de eliminación
        try (Connection con = ConexionBD.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);// Establece el parámetro ID
            ps.executeUpdate();// Ejecuta la eliminación
        }
    }
}
