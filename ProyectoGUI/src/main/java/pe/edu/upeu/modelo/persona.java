package pe.edu.upeu.modelo;

public class persona {
    public String codigo;
    public String nombres;
    public boolean asistencia;   
    
    public persona(String codigo, 
    String nombres, boolean asistencia){
        this.codigo=codigo;
        this.nombres=nombres;
        this.asistencia=asistencia;
    }
}