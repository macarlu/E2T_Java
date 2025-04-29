package com.escaño.crud;// Paquete que organiza la clase dentro de la estructura del proyecto
import java.sql.*;// Importa las clases necesarias para trabajar con JDBC (Connection, SQLException, DriverManager)
/**
 * Clase que gestiona la conexión a una base de datos MySQL.
 * Proporciona métodos estáticos para establecer y manejar la conexión.
 */
public class ConexionBD {
    // URL de conexión a la base de datos MySQL. Especifica la dirección IP, puerto y nombre de la BD.
    private static final String URL = "jdbc:mysql://192.168.7.41:3306/escuela_jgomg28";
    private static final String USUARIO = "SuPeRuSeR";// Nombre de usuario para autenticarse en la base de datos
    private static final String CLAVE = "SuPeR2024Us3R";// Contraseña asociada al usuario para autenticarse en la base de datos
/**
     * Establece y devuelve una conexión a la base de datos utilizando los parámetros definidos.
     * 
     * @return Connection objeto de conexión a la base de datos
     * @throws SQLException si ocurre un error al intentar conectar con la base de datos
     */
    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, CLAVE);
    }
}