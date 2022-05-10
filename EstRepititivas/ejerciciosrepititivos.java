package EstRepititivas;

public class ejerciciosrepititivos {

public static void ejer41While() {
    int contador=1;
    int suma=0;
    while (contador<=20) {
        if (contador%2==0) {
            suma=suma+contador;
        }
        contador++;
    }
    System.out.println("la respuesta es:"+suma);
}

    public static void main(String[] args) {
        ejer41While();
    }
}
