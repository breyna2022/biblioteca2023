
package pe.edu.utp.biblioteca.daoImpl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pe.edu.utp.biblioteca.config.Conexion;
import pe.edu.utp.biblioteca.dao.AutorDao;
import pe.edu.utp.biblioteca.model.Autor;

/**
 *
 * @author admin
 */
public class AutorDaoImpl implements AutorDao{
    private CallableStatement cst;
    private ResultSet rs;
    private Connection cx;
    @Override
    public int create(Autor a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Autor a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Autor read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Autor> readAll() {        
        List<Autor> lista = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            cst = cx.prepareCall("{call sp_listar_Autores()}");
            rs = cst.executeQuery();
            while(rs.next()){
                Autor a = new Autor();
                a.setIdautor(rs.getInt(1));
                a.setNombres(rs.getString(2));
                a.setApellidos(rs.getString(3));
                a.setFoto(rs.getString(4));
                a.setEstado(rs.getBoolean(5));
                lista.add(a);
            }
        } catch (SQLException e) {
            System.out.println("Error:"+e);
        }
        return lista;
    }
    
}
