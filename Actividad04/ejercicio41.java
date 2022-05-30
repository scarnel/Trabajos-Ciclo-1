package Actividad04;

public class ejercicio41 {
    
    public static void main(String[] args) {
        int salario = 1500;
        double r = 1;
        for(int i = 1; i <= 6; i++){
            r = salario+(salario*0.10)*i;
            System.out.println("el salario al cabo de "+i+" años es de "+r);
        }
    }
}
