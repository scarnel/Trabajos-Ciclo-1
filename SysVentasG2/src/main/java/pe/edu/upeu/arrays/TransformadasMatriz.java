package pe.edu.upeu.arrays;

import java.util.Scanner;

public class TransformadasMatriz {
    Scanner cs=new Scanner(System.in);

    public void transformada01() {
        System.out.println("Ingrese Dimension Matriz:");
        int dimension=cs.nextInt();
        System.out.println("Ingrese valor de Inicio:");
        int valorInit=cs.nextInt();
        String[][] matriz=new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                if(c<dimension-f){
                    matriz[f][c]=String.valueOf(valorInit+(f+c)*(f+c+1)/2+f);
                }else{matriz[f][c]="";}             
            }
        }
        imprimirMatrices(matriz);
    }

    public void transformada02() {
        System.out.println("Ingrese Dimension Matriz:");
        int dimension=cs.nextInt();
        System.out.println("Ingrese valor de Inicio:");
        int valorInit=cs.nextInt();
        String[][] matriz=new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                if(c<dimension-f){
                    matriz[f][c]=String.valueOf(valorInit+(f+c)*(f+c+1)/2+c);
                }else{matriz[f][c]="";}             
            }
        }
        imprimirMatrices(matriz);
    }

    public void transformada03() {
        System.out.println("Ingrese Dimension Matriz:");
        int dimension=cs.nextInt();
        System.out.println("Ingrese valor de Inicio:");
        int valorInit=cs.nextInt();
        String[][] matriz=new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz.length-f ; c++) {
                if((c+f)%2==0){
                    matriz[f][c]=String.valueOf(valorInit+(f+c)*(f+c+1)/2+c);
                    
                }else{
                    matriz[f][c]=String.valueOf(valorInit+(f+c)*(f+c+1)/2+f);
                    
                }       
            }
        }
        imprimirMatrices(matriz);
    }

    public void transformada04() {
        System.out.println("Ingrese Dimension Matriz:");
        int dimension=cs.nextInt();
        System.out.println("Ingrese valor de Inicio:");
        int valorInit=cs.nextInt();
        String[][] matriz=new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz.length-f ; c++) {
                if((c+f)%2==0){
                    matriz[f][c]=String.valueOf(valorInit+(f+c)*(f+c+1)/2+f);
                    
                }else{
                    matriz[f][c]=String.valueOf(valorInit+(f+c)*(f+c+1)/2+c);
                    
                }       
            }
        }
        imprimirMatrices(matriz);
    }

    public static String[][] transformada06(int d, int n) {
        String[][] matriz = new String[d][d];
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j<=i ; j++) {        
                matriz[i][j]=""+n;
                n++;      
        }
    }
    return matriz;
} 

    public static String[][] transformada07(int d, int n) {
        String[][] matriz=new String[d][d];
    for (int i = 0; i < matriz.length; i++) {
        for (int j =0; j<=(matriz.length-1)-i; j++) {        
                    matriz[i][j]=""+n;
                    n++;
            }
        }
    return matriz;
}

    public static String[][] transformada08(int d, int n) {
    String[][] matriz=new String[d][d];
    for (int i = 0; i < matriz.length; i++) {
        for (int j =i; j< matriz[i].length; j++) {        
                matriz[i][j]=""+n;
                n++;      
        }
    }
        return matriz;
}

    public static String[][] transformada09(int d, int n) {
    String[][] matriz=new String[d][d];
    for (int i = 0; i < matriz.length; i++) {
        for (int j = (matriz[0].length-1)-i; j<=matriz[0].length-1; j++) {        
                matriz[i][j]=""+n;
                n++;      
        }
    }
        return matriz;
} 

    public void transformada11() {
    System.out.println("Ingrese Dimension Matriz:");
    int dimension=cs.nextInt();
    System.out.println("Ingrese valor de Inicio:");
    int valorInit=cs.nextInt();  
    String[][] matriz=new String[dimension][dimension];
    
    for (int fila = 0; fila < matriz.length; fila++) {
        for (int columna = matriz[0].length-1-fila; columna>= 0; columna--) {
            matriz[fila][columna]=""+valorInit;
            valorInit++;
        }
    }
    imprimirMatrices(matriz);
}

    public void transformada12() {
        System.out.println("Ingrese Dimension Matriz:");
        int dimension=cs.nextInt();
        System.out.println("Ingrese valor de Inicio:");
        int valorInit=cs.nextInt();  
        String[][] matriz=new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = matriz[0].length-1; c>=(0+f) ; c--) {
                matriz[f][c]=String.valueOf(valorInit);
                valorInit++;//1
            }
        } 
        imprimirMatrices(matriz);
    }
    
    public static String[][] transformada13(int d, int n) {
        String[][] matriz=new String[d][d];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; i<=(matriz.length-1)-j; j++) {        
                    matriz[j][i]=""+n;
                    n++;      
            }
        }
            return matriz;
    }
    
    public static String[][] transformada14(int d, int n) {
        String[][] matriz=new String[d][d];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j<=i ; j++) {        
                    matriz[j][i]=""+n;
                    n++;      
            }
        }
        return matriz;
    }

    public static String[][] transformada15(int d, int n) {
        String[][] matriz=new String[d][d];
        for (int i = 0; i < matriz.length; i++) {
            for (int j =0; i<=(matriz.length-1)-j; j++) {        
                    matriz[(d-1)-j][i]=""+n;
                    n++;      
            }
        }
            return matriz;
    } 

    public static String[][] transformada16(int d, int n) {
        String[][] matriz = new String[d][d];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j<=i ; j++) {        
                    matriz[(d-1)-j][i]=""+n;
                    n++;      
            }
        }
        return matriz;
    
    }

    public static String[][] transformada17(int d, int n) {
        String[][] matriz=new String[d][d];
        for (int i = 0; i < matriz.length; i++) {
            for (int j =0; i<=(matriz.length-1)-j; j++) {        
                    matriz[j][(d-1)-i]=""+n;
                    n++;      
            }
        }
            return matriz;
    }

    public static String[][] transformada25(int d, int n) {
        String[][] matriz=new String[d][d];
        for (int j = 0; j<matriz[0].length ; j++) { 
            if(j%2==0){
                for (int i =0; i <matriz.length; i++) {             
                    matriz[j][i]=""+n;
                    n++;      
                }
            } else{
                for (int i =(matriz.length-1); i >=0; i--) {             
                    matriz[j][i]=""+n;
                    n++;      
                }
            }
        }
            return matriz;
    } 

    public static String[][] transformada26(int d, int n) {
        String[][] matriz=new String[d][d];
        for (int j = 0; j<matriz[0].length ; j++) { 
            if(j%2==0){
                for (int i =(matriz.length-1); i >=0; i--) {             
                    matriz[j][i]=""+n;
                    n++;      
                }
             
            } else{
                for (int i =0; i <matriz.length; i++) {             
                    matriz[j][i]=""+n;
                    n++;      
                }
            }
        }
            return matriz;
    }

    public static String[][] transformada27(int d, int n) {
        String[][] matriz=new String[d][d];
        for (int i = (matriz.length-1); i>=0 ; i--) { 
            if(i%2==0){
                for (int j =(matriz.length-1); j >=0; j--) {             
                    matriz[i][j]=""+n;
                    n++;      
                }
              
            } else{
                for (int j =0; j <matriz.length; j++) {             
                    matriz[i][j]=""+n;
                    n++;      
                }
            }
        }
            return matriz;
    }

    public void transformada28() {
       System.out.println("Ingrese la Dimension de la Matriz:"); 
       int dimension=cs.nextInt();
       System.out.println("");
       String[][] matriz=new String[dimension][dimension];
       int valor=0;
        for (int fila = matriz.length-1; fila >= 0; fila--) {
            if(fila%2==0){
                for (int columna = 0; columna < matriz.length; columna++) {
                    matriz[fila][columna]=""+valor;
                    valor++;
                }
            }else{
                for (int columna = matriz[0].length-1; columna >= 0; columna--) {
                    matriz[fila][columna]=""+valor;
                    valor++;
                }
            }
        }
        imprimirMatrices(matriz);
    }
    
    public void transformada29() {
        System.out.println("Ingrese la Dimension de la Matriz:"); 
        int dimension=cs.nextInt();
        System.out.println("");
        String[][] matriz=new String[dimension][dimension];//5
        int valor=0;              
        for (int v = 0; v < dimension/2; v++) {//2.5
            for (int ls = v; ls < (matriz[0].length-1)-v; ls++) {
                matriz[v][ls]=""+valor;
                valor++;
            }
            for (int ld = v; ld < (matriz.length-1)-v; ld++) {
                matriz[ld][(matriz.length-1)-v]=""+valor;
                valor++;
            }
            for (int lin = (matriz.length-1)-v; lin > v; lin--) {
                matriz[(matriz.length-1)-v][lin]=""+valor;
                valor++;
            }
            for (int liz = (matriz.length-1)-v; liz  > v; liz--) {
                matriz[liz][v]=""+valor;
                valor++;                
            }
        }
        if (dimension%2!=0) {
            matriz[dimension/2][dimension/2]=""+valor;
            }
        imprimirMatrices(matriz);
    }

    public void transformada30() {
        System.out.println("Ingrese la Dimension de la Matriz:"); 
        int dimension=cs.nextInt();
        System.out.println("");
        String[][] matriz=new String[dimension][dimension];//5
        int valor=0;              
        for (int v = 0; v < dimension/2; v++) {//2.5
            for (int lin = (matriz.length-1)-v; lin > v; lin--) {
                matriz[(matriz.length-1)-v][lin]=""+valor;
                valor++;
            }
            for (int ld = v; ld < (matriz.length-1)-v; ld++) {
                matriz[ld][(matriz.length-1)-v]=""+valor;
                valor++;
            }
            for (int ls = v; ls < (matriz[0].length-1)-v; ls++) {
                matriz[v][ls]=""+valor;
                valor++;
            }
        
            for (int liz = (matriz.length-1)-v; liz  > v; liz--) {
                matriz[liz][v]=""+valor;
                valor++;                
            }
        }
        if (dimension%2!=0) {
            matriz[dimension/2][dimension/2]=""+valor;
            }
        imprimirMatrices(matriz);
    }

    public static String[][] transformada31(int d, int n) {
        String[][] matriz = new String[d][d];
        for (int v = 0; v < d / 2; v++) {
    
            for (int i = d - 1 - v; i > v; i--) {
                matriz[d - 1 - v][i] = "" + n;
                n++;
            }
            for (int j = d - 1 - v; j > v; j--) {
                matriz[j][v] = "" + n;
                n++;
            }
            for (int k = v; k < d - 1 - v; k++) {
                matriz[v][k] = "" + n;
                n++;
            }
            for (int l = v; l < d - 1 - v; l++) {
                matriz[l][d - 1 - v] = "" + n;
                n++;
            }
        }
        if (d % 2 != 0) {
            matriz[d / 2][d / 2] = "" + n;
        }
        return matriz;
    }

    public void transformada32() {
        System.out.println("Ingrese la Dimension de la Matriz:"); 
        int dimension=cs.nextInt();
        System.out.println("");
        String[][] matriz=new String[dimension][dimension];//5
        int valor=0;              
        for (int v = 0; v < dimension/2; v++) {//2.5
            for (int liz = (matriz.length-1)-v; liz  > v; liz--) {
                matriz[liz][v]=""+valor;
                valor++;                
            }
            for (int ls = v; ls < (matriz[0].length-1)-v; ls++) {
                matriz[v][ls]=""+valor;
                valor++;
            }
            for (int ld = v; ld < (matriz.length-1)-v; ld++) {
                matriz[ld][(matriz.length-1)-v]=""+valor;
                valor++;
            }
            for (int lin = (matriz.length-1)-v; lin > v; lin--) {
                matriz[(matriz.length-1)-v][lin]=""+valor;
                valor++;
            }
            
        }
        if (dimension%2!=0) {
            matriz[dimension/2][dimension/2]=""+valor;
            }
        imprimirMatrices(matriz);
    }

    public static String[][] transformada33(int d, int n) {
        String[][] matriz = new String[d][d];
        for (int v = matriz.length - 1; v >= matriz.length / 2; v--) {
            for (int i = v; i > (d - 1) - v; i--) {
                matriz[(d - 1) - v][i] = "" + n;
                n++;
            }
            for (int j = (d - 1) - v; j < v; j++) {
                matriz[j][(d - 1) - v] = "" + n;
                n++;
            }
            for (int k = (d - 1) - v; k < v; k++) {
                matriz[v][k] = "" + n;
                n++;
            }
            for (int l = v; l > (d - 1) - v; l--) {
                matriz[l][v] = "" + n;
                n++;
            }
        }
        if (d % 2 != 0) {
            matriz[d / 2][d / 2] = "" + n;
        }
        return matriz;
    }

    public static String[][] transformada34(int d, int n) {
        String[][] matriz = new String[d][d];
        for (int v = matriz.length - 1; v >= matriz.length / 2; v--) {
    
            for (int i = (d - 1) - v; i < v; i++) {
                matriz[i][(d- 1) - v] = "" + n;
                n++;
            }
            for (int j = (d - 1) - v; j < v; j++) {
                matriz[v][j] = "" + n;
                n++;
            }
            for (int k = v; k > (d - 1) - v; k--) {
                matriz[k][v] = "" + n;
                n++;
            }
            for (int l = v; l > (d - 1) - v; l--) {
                matriz[(d - 1) - v][l] = "" + n;
                n++;
            }
        }
        if (d % 2 != 0) {
            matriz[d / 2][d / 2] = "" + n;
        }
        return matriz;
    }

    public static String[][] transformada36(int d, int n) {
        String[][] matriz = new String[d][d];
        for (int v = matriz.length - 1; v >= matriz.length / 2; v--) {
    
            for (int i = v; i > (d - 1) - v; i--) {
                matriz[i][v] = "" + n;
                n++;
            }
            for (int j = v; j > (d - 1) - v; j--) {
                matriz[(d - 1) - v][j] = "" + n;
                n++;
            }
            for (int k = (d - 1) - v; k < v; k++) {
                matriz[k][(d - 1) - v] = "" + n;
                n++;
            }
            for (int  l = (d - 1) - v; l < v; l++) {
                matriz[v][l] = "" + n;
                n++;
            }
        }
        if (d % 2 != 0) {
            matriz[d / 2][d / 2] = "" + n;
        }
        return matriz;
    }

    public void imprimirMatrices(String[][] m) {
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m[0].length; c++) {
                if (m[f][c]==null) {
                    System.out.print("\t");
                }else{
                    System.out.print(m[f][c]+"\t");   
                }                            
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        new TransformadasMatriz().transformada02();
        System.out.println("---------------------------------------------------");
        new TransformadasMatriz().imprimirMatrices(transformada36(5, 0));
    System.out.println("");
    } 
}
    

