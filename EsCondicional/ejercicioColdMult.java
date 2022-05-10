package EsCondicional;

import java.util.Scanner;

/**
 * ejercicioColdMult
 */
public class ejercicioColdMult {
    public static void profesor() {
        System.out.println("la funcion del docente es enseñar ");
    }
    public static void estudiante() {
        System.out.println("la funcion del estudiante es aprender");
    }
    public void PC() {
        System.out.println("la funcion de la PC es procesar informacion ");
    }
    public void proyector() {
        System.out.println("proyectar informacion o imagen ");
    }
     
    public static void main(String[] args) {
        ejercicioColdMult objx=new ejercicioColdMult();
        
        Scanner lt=new Scanner(System.in);
        System.out.println("ingrese el algoritmo que desea probar\n1=profesor"+
        "\n2=estudiante\n3=PC\n4=proyector");
        int opcMet=lt.nextInt();
        
        switch (opcMet) {
            case 1: profesor(); break;
            case 2: estudiante(); break;
            case 3: objx.PC(); break;
            case 4: objx.proyector(); break;
            
            default: System.err.println("opcion invalida "); break;
        }



    }
}