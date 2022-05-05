package EsCondicional;

import java.util.Scanner;

/**
 * ejercicio3.7
 */
public class ejercicio37 {
    
    static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {
      //declarar variable
       int edad;
       double promedio;
       String resbecas; 
       //Datos de entrada
       System.out.println("ingrese la edad: ");
       edad=lt.nextInt();
       System.out.println("ingrese el promedio: ");
       promedio=lt.nextDouble();
       //proceso
       if (edad>18) {
           if (promedio>=18) {
               resbecas="le correspode el monto de 2000";
           }else if (promedio >=15) {
            resbecas="le correspode el monto de 1000";
           }else if (promedio <15 && promedio >=12) {
            resbecas="le correspode el monto de 500";
           }else {
            resbecas="enviar una carta para estudiar";
           }
       } else {
           if (promedio>=18) {
            resbecas="le correspode el monto de 3000";
           }else if (promedio <18 && promedio >=16) {
            resbecas="le correspode el monto de 2000";
           }else if (promedio <16 && promedio >=12) {
            resbecas="le correspode el monto de 100";
           }else {
            resbecas="enviar una carta para estudiar ";
           }
       }
       //Datos de salida 
       System.out.println(resbecas);

    }
}