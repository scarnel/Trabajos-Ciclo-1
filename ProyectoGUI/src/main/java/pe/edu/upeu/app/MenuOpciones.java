package pe.edu.upeu.app;

import java.io.Console;

import pe.edu.upeu.modelo.usuarioTO;
import pe.edu.upeu.util.LeerTeclado;

public class MenuOpciones {
    LeerTeclado leert=new LeerTeclado();
    usuarioTO uto=new usuarioTO();
    Console cons=System.console();

    public void login() {
        System.out.println("Bienvendos al Sistema de Ventas");
        System.out.println("Valide sus credeniciales");
        uto.user=leert.leer("", "Ingrese su usuario:");
        System.out.println("Ingrese su clave:");
        char [] clavex=cons.readPassword();
        uto.clave=String.valueOf(clavex);
        if (uto.user.equals("oscar") && uto.clave.equals("123456")) {
           menuPrincipal();
        }else {
            System.out.println("incorrecto, intentelo de nuevo");
            login();
        }
    }

    public void menuPrincipal() {
        System.out.println("Sistema de ventas");
        int opciones= 1;
        String menu ="";
        menu += "1=registrode pruductos\n";
        menu += "2=registro de ventas\n";
        System.out.println(menu);
        do {
            switch (opciones) {
                case 1:System.out.println("registro de productos");   break;
            
                default:System.out.println("opcion invalida");     break;
            }
            String continuar=leert.leer("", "Desea continuar? S=si/N=NO").charAt(0)=='S'?"S":"N";
            if (continuar.charAt(0)=='S') {
                opciones=leert.leer(0, "Eliga una operacion:\n"+menu);
            }else {opciones=0;}
        } while (opciones!=0);
    }

}
