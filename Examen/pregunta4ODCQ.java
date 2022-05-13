import java.util.Scanner;

public class pregunta4ODCQ{

    static Scanner in = new Scanner(System.in);

  public static void main(String args[]){
    //variables
    int edad =0;
    String sexo = "";
    //datos de entrada
    System.out.print("indique la edad ");
    edad = in.nextInt();
    System.out.print("indique su sexo ");
    sexo = in.next();
    //proceso
    if(edad >=70){
      System.out.print("Se le aplicara del tipo C");
    }else if(edad>=16 && edad<=69 && "mujer".equalsIgnoreCase(sexo)){
      System.out.print("Se le aplicara del tipo B");
    }else if(edad>=16 && edad <=69 && "hombre".equalsIgnoreCase(sexo)){
      System.out.print("Se le aplicara del tipo A");
    }else if(edad<16){
      System.out.print("Se le aplicara del tipo A");
    }
    
  }
}