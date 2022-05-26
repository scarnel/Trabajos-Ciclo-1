package subprogramas;

public class Persona {
    String nombre;
    String dni="";
    int edad;
    char genero;

    public void comer(String alimentos) {
        System.out.println(nombre + " come "+alimentos+" y su DNI es "+dni);
    }
    public void estudiar(String curso) {
        System.out.println(nombre+" estudia el curso "+curso);
    }

}
