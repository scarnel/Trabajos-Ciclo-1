package pe.edu.upeu.modelo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter

public class productoTO {
    public String idProducto , nombre , idCate, idMarca;
    public double pu, utilidad;
    public int stock;

}
