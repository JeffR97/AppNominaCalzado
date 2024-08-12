/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud_Taller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jeff_
 */
public class conexion {
//    Connection con;
//    
//    public conexion(){
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_calzado","root","");
//        }catch (Exception e){
//            System.out.println("No se establecio conexión");
//        }
//    }
//    
//    public Connection getConnection(){
//        return con;
//    }

    private static final String URL = "jdbc:mysql://localhost:3306/bd_calzado";
    private static final String USER = "Jeff_R";
    private static final String PASSWORD = "2022universidadJEFF-";    
    

    /**
     * Obtiene una nueva conexión a la base de datos.
     *
     * @return Connection objeto de conexión a la base de datos.
     * @throws SQLException si ocurre un error al obtener la conexión.
     */
    public Connection getConnection() throws SQLException {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver no encontrado: " + e.getMessage());
            return null;
        }
    }
}
