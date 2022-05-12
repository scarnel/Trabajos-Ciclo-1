import java.util.Scanner;

/**
 * pregunta1
 */
public class pregunta2 {

    static Scanner lt=new Scanner(System.in);

    public static void main(String[] args) {
        //declarar varible
        double monto,IGV,descuento;
        double pagar;
        //datos de entrada
        System.out.println("ingrese el monto :");
        monto=lt.nextDouble();
        //proceso
       
        if (monto>=2000) {
            IGV=monto*0.18;
            descuento=IGV+monto;
            pagar=descuento*0.10;
            monto=descuento-pagar;
        } else if (monto>=1000) {
            IGV=monto*0.18;
            descuento=IGV+monto;
            pagar=descuento*0.05;
            monto=descuento-pagar;
        } else if (monto>=500) {
            IGV=monto*0.18;
            descuento=IGV+monto;
            pagar=descuento*0.02;
            monto=descuento-pagar;
        } else {
            IGV=monto*0.18;
            monto=IGV+monto;
            
        }
            
            
        
        //datos de salida
        System.out.println("el monte a total es :" +monto);
        System.out.println("el IGV a pagar es :" +IGV);


    }
}