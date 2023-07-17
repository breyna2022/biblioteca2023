
package pe.edu.utp.biblioteca.dao;

import java.util.List;
import pe.edu.utp.biblioteca.model.Autor;

/**
 *
 * @author admin
 */
public interface AutorDao {
    int create(Autor a);
    int update(Autor a);
    int delete(int id);
    Autor read(int id);
    List<Autor> readAll();
}
