import java.util.Scanner;

/**
 * pregunta5
 */
public class pregunta5ODCQ {

    static Scanner lt=new Scanner(System.in);

    public static void preguntaN5() {
        System.out.println("ingrese el primer valor: ");
        double valor1=lt.nextDouble();
        System.out.println("ingrese el segundo valor:");
        double valor2=lt.nextDouble();
        System.out.println("ingrese el operador: ");
        char operador=lt.next().charAt(0);
        switch (operador) {
            case '+' :System.out.println("la suma de dos valores es "+valor1+valor2); break;
            case '-' :System.out.println("la resta de dos valores es:");
            System.out.println(valor1-valor2); break;
            case '/' :System.out.println("la division de dos valores es "+valor1/valor2); break;
            case '*' :System.out.println("la multiplicacion de aritmetica de dos valores es "+valor1*valor2); break;
            case '^' :System.out.println("la potencia de aritmetica de dos valores es "+Math.pow(valor1, valor2)); break;
            case 'R' :System.out.println(Math.sqrt(valor1));
            System.out.println("la raiz de dos valores es "+Math.sqrt(valor2)); break;
            case '%' :System.out.println(valor1%2);
            System.out.println("el modulo de dos valores es "+valor2%2); break;
            default:
                break;
        }


    }

    public static void main(String[] args) {
        preguntaN5();
    }
}