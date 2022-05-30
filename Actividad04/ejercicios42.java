package Actividad04;

import java.util.Scanner;

public class ejercicios42 {
    static Scanner lt=new Scanner(System.in);

    public static void amburguesas() {
        //Definir Variables
        int canthambS=0, canthambD=0, canhambT=0;
        String tipohamb="";
        String continuar="S";
        double precioS=10,precioD=12,precioT=14;
        double rS=0,rT=0,rD=0,r;
        //Datos de entrada y proceso
        while (continuar.equals("S")) {
            System.out.println("Ingrese el tipo de hamburguesa:\nS=simple\nD=doble\nT=triple");
            tipohamb=lt.next().toUpperCase();
            if (tipohamb.charAt(0)=='S') {
                canthambS++;
                rS=canthambS*(precioS+(precioS*0.05));
            }else if (tipohamb.charAt(0)=='D') {
                canthambD++;
                rD=canthambD*(precioD+(precioD*0.05));
            } else if (tipohamb.charAt(0)=='T') {
                canhambT++;
                rT=canhambT*(precioT+(precioT*0.05));
            }else{
                System.err.println("No es correcto el tipo de hamburguesa");
            }
            System.out.println("Tiene mas hamburguesas para pedir?:\nS=Si\tN=No");
            continuar=lt.next().toUpperCase().equals("S")?"S":"N";

        }
        //Datos de salida
        System.out.println("el precio en total de hamburguesas es de :"+(rS+rD+rT));
    }

    public static void main(String[] args) {
        amburguesas();
    }
}