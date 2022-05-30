package Actividad04;

import java.util.Scanner;

/**
 * ejercicio48
 */
public class ejercicio48 {

    public static void Actividad8() {
        Scanner lt=new Scanner(System.in);
        int anhos;
        double saldo=0, interes=0, total=0, deposito=0;
        //Datos de entrada
        System.out.println("Ingrese los años de ahorros: ");
        anhos=lt.nextInt();
        //Proceso
        while (anhos>0) {
            for (int i = 0; i < 12; i++) {
            System.out.println("ingrese el deposito del mes "+(i+1)+":");
            deposito=lt.nextDouble();
            saldo=saldo+deposito;
        }
        interes=interes+(saldo*0.10);
        total=saldo+interes;
        anhos=anhos-1;
        }
        //Datos de salida
        System.out.println("Tu ahorro en el año es: "+saldo);
        System.out.println("El interes ganado es: "+interes);
        System.out.println("Tu ahorro ya con interes es: "+total);
        System.out.println(" ");
    }
    public static void main(String[] args) {
        Actividad8();
    }
}