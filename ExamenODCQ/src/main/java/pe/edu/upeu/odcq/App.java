package pe.edu.upeu.odcq;

import java.util.Scanner;

import pe.edu.upeu.odcq.Examen.ResolucionExamen;
import pe.edu.upeu.odcq.utils.LeerTeclado;

/**
 * Hello world!
 *
 */
public class App {

    public void menudeOpciones() {
        Scanner let=new Scanner(System.in);
        LeerTeclado lt=new LeerTeclado();
        String continuar="S";
        String pregunta="";
        while (continuar.equals("S")) {
            System.out.println("Ingrese el numero de pregunta: \n2=pregunta 2\n3=pregunta 3\n4=pregunta 4\n5=pregunta 5");
            pregunta=let.next().toUpperCase();
            if (pregunta.charAt(0)=='2') {
                new ResolucionExamen().pregunta2();
            }else if (pregunta.charAt(0)=='3') {
                new ResolucionExamen().pregunta3();
            }else if (pregunta.charAt(0)=='4') {
                new ResolucionExamen().pregunta4();
            }else if (pregunta.charAt(0)=='5') {
                System.out.println("el numero binario de 72 es:");
                new ResolucionExamen().pregunta5(72);
            }else {System.out.println("no es correcto la pregunta");}
            System.out.println("\nquiere seguir evaluando las preguntas \nS=Si\nN=No");
            continuar=let.next().toUpperCase().equals("S")?"S":"N";
        }


    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App obj=new App();
        obj.menudeOpciones();
    }
}
