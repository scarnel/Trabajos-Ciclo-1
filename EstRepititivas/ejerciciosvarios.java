package EstRepititivas;

import java.math.BigInteger;
import java.util.Scanner;

public class ejerciciosvarios {
    
    static Scanner lT=new Scanner(System.in);

    public static void factorialXnum() {
        int n; 
        long result=1;
        System.out.println("Ingrese un numero:");
        n=lT.nextInt();
        if(n>1){
        for (int i = 1; i <=n; i++) {
            result=result*i; 
            }
        }
        System.out.println("El factorial de "+n+" es:"+result);
    }

    public static long factorialnum(int n) {
        long result=1;
        if(n>1){
        for (int i = 1; i <=n; i++) {
            result=result*i; 
            }
        }
        //System.out.println("El factorial de "+n+" es:"+result);
        return result;
    }

    public static BigInteger factorialnumbig(int n) {
        BigInteger result=new BigInteger("1");
        if(n>1){
        for (int i = 1; i <=n; i++) {
            result=result.multiply(new BigInteger(String.valueOf(i))); 
            }
        }
        //System.out.println("El factorial de "+n+" es:"+result);
        return result;
    }

    public static void main(String[] args) {
        /*factorialXnum();
        long resultado=factorialnum(10);
        System.out.println("El resultado es :"+resultado);*/

        System.out.println("ingrese un numero: ");
        int numero=lT.nextInt();
        for (int i = 1; i <= numero; i++) {
            System.out.println("Factorial de "+i+"¡ = " + factorialnumbig(i));
        }

    }

}

