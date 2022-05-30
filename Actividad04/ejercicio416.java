package Actividad04;

import java.util.Scanner;

public class ejercicio416 {
    public static void main(String[] args) {
        Scanner lt=new Scanner(System.in);
        int M ;
        System.out.println("ingrese un numero entero ");
        M = lt.nextInt();
        int multiplicador = 1;
        while(multiplicador <=10){
        System.out.println(M + " X " + multiplicador + " = " + M * multiplicador );
        multiplicador++;
    
        }
    }
}

