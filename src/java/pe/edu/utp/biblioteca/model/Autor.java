
package pe.edu.utp.biblioteca.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author admin
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Autor {
    private int idautor;
    private String nombres;
    private String apellidos;
    private String foto;
    private boolean estado;
}
