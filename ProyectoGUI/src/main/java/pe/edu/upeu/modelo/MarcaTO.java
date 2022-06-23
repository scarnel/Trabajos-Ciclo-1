package pe.edu.upeu.modelo;

public class MarcaTO {

    public String idmarca;
    public String nombre;
    public MarcaTO(String idmarca, String nombre) {
        this.idmarca = idmarca;
        this.nombre = nombre;
    }
    public String getIdmarca() {
        return idmarca;  //get se queda el mismo 
    }
    public void setIdmarca(String idmarca) {
        this.idmarca = idmarca;  //set cambia de valor pero cambia 
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }





}
