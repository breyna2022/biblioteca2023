
package pe.edu.utp.biblioteca.test;

import com.google.gson.Gson;
import pe.edu.utp.biblioteca.dao.AutorDao;
import pe.edu.utp.biblioteca.daoImpl.AutorDaoImpl;

/**
 *
 * @author admin
 */
public class Test {
    static private Gson g = new Gson();
    static private AutorDao adao = new AutorDaoImpl();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println(g.toJson(adao.readAll()));
    }
    
}
