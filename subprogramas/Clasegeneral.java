package subprogramas;

import java.util.Scanner;

public class Clasegeneral {

    static Scanner lt=new Scanner(System.in);
    static Aritmetica obj=new Aritmetica();
    static Persona objP=new Persona();
    
    public static void main(String[] args) {
        /*System.out.println("ingrese el primer valor");
        int aX=lt.nextInt();
        System.out.println("ingrese el segundo valor");
        int bX=lt.nextInt();
        int result=obj.sumar(aX,bX);
        System.out.println("la suma es:"+result);*/
        System.out.println("ingrese su nombre:");
        objP.nombre=lt.next();
        System.out.println("ingrese su DNI:");
        objP.dni=lt.next();
        System.out.println("ingrese un alimento o comida");
        objP.comer(lt.next());
    }

}
