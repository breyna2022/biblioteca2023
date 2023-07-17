
package pe.edu.utp.biblioteca.daoImpl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import pe.edu.utp.biblioteca.config.Conexion;

/**
 *
 * @author admin
 */
public class ValidarUsuario {
    private CallableStatement cst;
    private ResultSet rs;
    private Connection cx;
    
    public HashMap<String, Object> validar(String x, String y) {
        HashMap<String, Object> map = new HashMap<>();

        try {
            cx = Conexion.getConexion();
            cst = cx.prepareCall("{call validar_usuario(?,?)}");
            cst.setString(1, x);
            cst.setString(2, y);
            rs = cst.executeQuery();
            while(rs.next()){                
                map.put("idu", rs.getInt("idusuario"));
                map.put("user", rs.getString("username"));
                map.put("nombres", rs.getString("nombres"));
                map.put("apellidos", rs.getString("apellidos"));
                map.put("rol", rs.getString("nombre"));
                map.put("idempleado", rs.getString("idempleado"));
            }
        } catch (SQLException e) {
            System.out.println("Error:"+e);            
        }
        return map;
    }
}
