package subprogramas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class leerteclado {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Ya tenemos el "lector"

    public int print(String mensaje, int valor) {
        return 0;
    }
    public String print(String mensaje, String valor) {
        return "0";
    }
    public float print(String mensaje, float valor) {
        return 0;
    }
    public double print(String mensaje, double valor) {
        return 0;
    }
    public boolean print(String mensaje, boolean valor) {
        return true;
    }
}