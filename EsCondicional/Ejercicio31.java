package EsCondicional;

import java.util.Scanner;

/**
 * Ejercicio31
 */
public class Ejercicio31 {
    static Scanner lt =new Scanner(System.in);

    public static void main(String[] args) {
        //Declarar variables
        int edad;
        String mensaje;
        //Datos de entrada
        System.out.println("ingrese la edad:");
        edad=lt.nextInt();
        //Proceso
        if (edad>=18) {
            mensaje="puede votar porque su edad es "+edad;
        } else {
            mensaje="no puede votar porque su edad es "+edad;
        }
        //Datos de salida 
        System.out.println(mensaje);

    }
}