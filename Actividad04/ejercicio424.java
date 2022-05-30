package Actividad04;

public class ejercicio424 {

    

    public static void main(String[] args) {
        int intentos = 4;
        int numero;
        boolean logrado = false;

        
        do {
          System.out.print("Introduzca la clave de la caja fuerte:) ");
          numero = Integer.parseInt(System.console().readLine());
          
          if (numero == 2022) {
            logrado = true;
          } else {
            System.out.println("Clave incorrecta :(");
          }
          
          intentos--;
      
        } while((intentos > 0) && (!logrado));
        
        if (logrado) {
          System.out.println("Ha abierto la caja fuerte FELICIDADES:)");
        } else {
          System.out.println("Lo siento, ha agotado las 4 oportunidades :(");
        }
    }
}

