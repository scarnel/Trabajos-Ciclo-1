import java.util.Scanner;

public class pregunta3{

    static Scanner in = new Scanner(System.in);

  public static void main(String args[]){
    //declarar variables
    double valor1 = 0, valor2 = 0, resultado = 0, raiz = 0, modulo = 0;
    String operacion = "";
    
    //datos de entrada
    System.out.print("indique la operacion");
    operacion = in.next();
    //proceso
    if("+".equals(operacion)){
      System.out.print("primer numero: ");
      valor1 = in.nextDouble();
      System.out.print("segundo numero: ");
      valor2 = in.nextDouble();
      resultado = valor1 + valor2;    
      System.out.println("el resultado de tu suma es "+resultado);  
    }else if("-".equals(operacion)){
      System.out.print("primer numero: ");
      valor1 = in.nextDouble();
      System.out.print("segundo numero: ");
      valor2 = in.nextDouble();
      resultado = valor1 - valor2;
      System.out.print("el resultado de tu resta es "+resultado);
      
    }else if("*".equals(operacion)){
      System.out.print("primer numero: ");
      valor1 = in.nextDouble();
      System.out.print("segundo numero: ");
      valor2 = in.nextDouble();
      resultado = valor1 * valor2;
      System.out.print("el resultado de tu multiplicacion es: "+ resultado);
      
    }else if("/".equals(operacion)){
      System.out.print("primer numero: ");
      valor1 = in.nextDouble();
      System.out.print("segundo numero: ");
      valor2 = in.nextDouble();
      resultado = valor1/valor2;
      System.out.print("el resultado de tu division es "+resultado);
      
    }else if("v".equals(operacion)){
      System.out.print("primer numero: ");
      valor1 = in.nextDouble();
      System.out.print("segundo numero : ");
      valor2 = in.nextDouble();
      System.out.print("el resultado de tu potencia es "+ 
      Math.pow(valor1,valor2));

    }else if("R".equals(operacion)){
      System.out.print("dame el numero: ");
      valor1 = in.nextDouble();
      raiz = Math.sqrt(valor1);
      System.out.print("la raiz cuadrada de "+valor1+ " es " + raiz);

    }else if("%".equals(operacion)){
      System.out.print("indique el numero: ");
      valor1 = in.nextDouble();
      resultado = valor1%2;
      System.out.print("el resultado de tu modulo es: "+resultado);
    }
    
  }
}