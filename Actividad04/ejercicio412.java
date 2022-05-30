package Actividad04;

import java.util.Scanner;

public class ejercicio412 {

    public static void ventas() {
        Scanner lt=new Scanner(System.in);
        int nm;
        int venta;
        double a=0;
        double b=0;
        double c=0;
        double t=0,t1=0,t2=0,t3=0;
        
        System.out.println("Ingrese el numero de ventas realizadas: ");
        nm=lt.nextInt();
        while (nm>0) {
            System.out.println("Ingresa el monto de la venta realizada "+nm);
            venta=lt.nextInt();
            if (venta>=20000){
			    a = a + 1;
			    t1 = t1+venta;
            }else if (venta>=10000 && venta<20000){
				b = b + 1;
				t2 = t2 + venta;
            }else{
				c = c + 1;
				t3 = t3 + venta;
            }
			t = t + venta;
		    nm = nm - 1;
       }
        System.out.println("Numero de ventas mayores a $20,000 es: "+a);
        System.out.println("El total de las ventas mayores a $20,000 es: "+t1);
	    System.out.println("Numero de ventas mayores a $10,000 y menores a $20,000 es: "+b);
	    System.out.println("El total de las ventas mayores a $10,000 y menores a $20,000 es: "+t2);
	    System.out.println("Numero de ventas menores a $10,000 es: "+c);
	    System.out.println("El total de las ventas menores a $10,000: "+t3);
	    System.out.println("El monto total de la ventas es: $"+t);
    }

    public static void main(String[] args) {
        ventas();
    }
}
