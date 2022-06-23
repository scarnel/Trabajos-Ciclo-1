package pe.edu.upeu.modelo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter

public class ventadetalleTO {
    public String idVentaDet , idVenta, idProducto ;
    public double descuento , pu ,subtotal ;
    public int cantidad ;
}
