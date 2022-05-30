package Actividad04;

import java.util.Scanner;

public class ejercicio413 {
    
    public static void main(String[] args) {
        int n, calificacion, reprobados, aprobados;
        Scanner lt=new Scanner(System.in);

        System.out.println("Ingresa el numero de alumnos: ");
        n = lt.nextInt();
        reprobados = 0;
        aprobados = 0;
        while(n > 0){
            System.out.println("ingresa una calificacion: ");
            calificacion = lt.nextInt();
            if(calificacion < 10){
                reprobados = reprobados + 1;
            }else {
                aprobados = aprobados + 1;
            }
            n = n - 1;
        }
        System.out.println("El total de alumnos aprobados es: " + aprobados);
        System.out.println("El total de alumnos reprobados es " + reprobados);
    }
}
    


