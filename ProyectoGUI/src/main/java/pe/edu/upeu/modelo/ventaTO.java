package pe.edu.upeu.modelo;

import lombok.Data;

@Data

public class ventaTO {
    public String idVenta , dniruc ;
    public double precioBase , igv , precioTotal;
}
