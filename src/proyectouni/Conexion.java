/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectouni;

import java.sql.*;

/**
 *
 * @author Administrador
 */
public class Conexion {
    /* datos para la conexion */
    private String bd = "db_programacion";
    private String login = "dbprogramacion";
    private String password = "dbprogramacion";
    private String url = "jdbc:mysql//localhost/"+bd;
    private Connection conn = null;
}
public Conexion(){
      try{
         //obtenemos el driver de para mysql
         Class.forName("com.mysql.jdbc.Driver");
         //obtenemos la conexión
         conn = DriverManager.getConnection(url,login,password);
         if (conn!=null){
            System.out.println("OK base de datos "+bd+" listo");
         }
      }catch(SQLException e){
         System.out.println(e);
      }catch(ClassNotFoundException e){
         System.out.println(e);
      }
    }





