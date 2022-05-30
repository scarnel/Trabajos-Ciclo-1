package Actividad04;

import java.util.Scanner;

public class ejercicio47 {
    public static void main(String[] args) {
        
        int n;
        double precio, descuento, total;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa el total de articulos: ");
        n = leer.nextInt();
        total = 0;
        while(n > 0){
            precio = 0;
            descuento = 0;
            System.out.println("Ingresa el precio del articulo: " + n);
            precio = leer.nextDouble();
            if(precio >= 200){
                descuento = precio * 0.15;
            }else {
                if(precio > 100){
                    descuento = precio * 0.12;
                }else {
                    descuento = precio *0.10;
                }
            }
            System.out.println("El precio del articulo con descuento es: " +(precio - descuento));
            System.out.println("El descuento aplicado es: $"+ descuento);
            total = total + (precio - descuento);
            n = n - 1;
        }
        System.out.println("El total a pagar es: $"+ total);
    }
}