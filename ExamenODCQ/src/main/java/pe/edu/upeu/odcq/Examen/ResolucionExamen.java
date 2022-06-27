package pe.edu.upeu.odcq.Examen;


import java.util.Scanner;

import pe.edu.upeu.odcq.utils.LeerTeclado;

public class ResolucionExamen {
    LeerTeclado leert=new LeerTeclado();
    
    public void pregunta2() {
        Scanner lt=new Scanner(System.in);
        int cantautoc1=1, cantautoc2=1, cantautoc3=1;
        String autoC="";
        String continuar="S";
        double costoc1=0, costoc2=0, costoc3=0, cs1=0,cs2=0, cs3=0;
        double precioc1, precioc2, precioc3;
        
        System.out.println("ingrese el precio del modelo de vehiculo 1");
        precioc1=lt.nextDouble();
        System.out.println("ingrese el precio del modelo de vehiculo 2");
        precioc2=lt.nextDouble();
        System.out.println("ingrese el precio del modelo de vehiculo 3");
        precioc3=lt.nextDouble();

        while (continuar.equals("S")) {
            System.out.println("ingrese la su categoria de auto:\nA=categoria1\nB=categoria2\nC=categoria3");
            autoC=lt.next().toUpperCase();
            if (autoC.charAt(0) == 'A') {
                cantautoc1++;
                costoc1=cantautoc1*(precioc1*0.12);
            }else if (autoC.charAt(0) == 'B') {
                cantautoc2++;
                costoc2=cantautoc2*(precioc2*0.08);
            }else if (autoC.charAt(0) == 'C') {
                cantautoc3++;
                costoc3=cantautoc3*(precioc3*0.05);
            }else { 
                System.err.println("no se correcto el modelo de auto");
            }
        cs1=cantautoc1*(precioc1*0.12);
        cs2=cantautoc2*(precioc2*0.08);
        cs3=cantautoc3*(precioc3*0.05);
        System.out.println("Tiene mas autos: \nS=Si\nN=No");
        continuar=lt.next().toUpperCase().equals("S")?"S":"N";
        }
        System.out.println("El impuesto que va a pagar por el auto categoria 1 es:"+(costoc1+cs1));
        System.out.println("El impuesto que va a pagar por el auto categoria 2 es:"+(costoc2+cs2));
        System.out.println("El impuesto que va a pagar por el auto categoria 3 es:"+(costoc3+cs3));
        System.out.println("El impuesto total que va a pagar por los autos es:"+((costoc1+cs1)+(costoc2+cs2)+(costoc3+cs3)));
    }

    public void pregunta3() {
        Scanner lt=new Scanner(System.in);
        int n;
        System.out.println("ingrese su numero:");
        n=lt.nextInt();
        int y=(n-1);
        if (n%2 != 0) {
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if((i==j)||((i+j)==y)){
                    System.out.print("*");
                    }else{
                    System.out.print(" ");
                    }
                }System.out.println();
            }
        }else {
            System.out.println("error");
        }
    }


    public void pregunta4() {
        long n, j, suma;
        System.out.println("Los cuatro primeros numeros perfectos son:");
        for(n=1;n <= 10000;n++){      
            suma = 0;
            for(j = 1;j < n;j++){                              
                 if(n % j==0){
                    suma = suma + j; 
                 }
            }if(n == suma){                          
             System.out.println(n);
          }
        }
    }
    
    public void pregunta5(int n) {
        if (n < 2) {
            System.out.print(n);
            return;
        } else {
            pregunta5(n / 2);
            System.out.print(n % 2);
            return;
        }
    }

}
