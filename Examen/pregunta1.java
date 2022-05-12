import java.util.Scanner;

/**
 * pregunta1
 */
public class pregunta1 {
static Scanner lt=new Scanner(System.in);
  
    public static void main(String[] args) {
        //declarar variable
        double conocimiento,personal,psicologico,nota;
        int nivel1,nivel2,nivel3,nivel4,nivel;
        //datos de entrada
        System.out.println("ingrese la nota de concimiento: ");
        conocimiento=lt.nextDouble();
        System.out.println("ingrese la nota personal");
        personal=lt.nextDouble();
        System.out.println("ingrese la nota psicolgica ");
        psicologico=lt.nextDouble();
        
        //proceso
        if (conocimiento>=17) {
            conocimiento=conocimiento*0.4;
            personal=personal*0.35;
            psicologico=psicologico*0.25;
            nota=conocimiento+personal+psicologico;
            nota=nota;
            nivel=4;
        } else if (personal>=14) {
            conocimiento=conocimiento*0.4;
            personal=personal*0.35;
            psicologico=psicologico*0.25;
            nota=conocimiento+personal+psicologico;
            nota=nota;
            nivel=3;
        } else if (psicologico>=11) {
            conocimiento=conocimiento*0.4;
            personal=personal*0.35;
            psicologico=psicologico*0.25;
            nota=conocimiento+personal+psicologico;
            nota=nota;
            nivel=2;
        } else {
            conocimiento=conocimiento*0.4;
            personal=personal*0.35;
            psicologico=psicologico*0.25;
            nota=conocimiento+personal+psicologico;
            nota=nota;
           nivel=1; 
        }
        //datos de salida 
        System.out.println("el nivel del postulante :"+nivel);
        System.out.println("la nota del postulate es :"+nota);
    }
}