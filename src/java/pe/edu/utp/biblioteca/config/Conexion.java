
package pe.edu.utp.biblioteca.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alum.fial8
 */
public class Conexion {

    private static final String URL = "jdbc:mysql://localhost:3306/dbbiblioteca?serverTimezone=UTC";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASS = "root";
    private static Connection cx = null;
    public static Connection getConexion(){
        try {
            Class.forName(DRIVER);
            if(cx == null){
                cx = DriverManager.getConnection(URL, USER, PASS);
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: "+e);
        }
        return cx;
    }
   public static void cerrar() throws SQLException {
      if (cx != null) {
         cx.close();
      }
   } 
}
