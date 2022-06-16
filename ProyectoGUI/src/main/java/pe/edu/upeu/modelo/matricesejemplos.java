package pe.edu.upeu.modelo;

import java.rmi.server.ObjID;

public class matricesejemplos {
    
    public void matricesbasicos() {
        Object[][] prod;
        prod=new Object[2][4];
        prod[0][0]="P001";
        prod[0][1]="manzana";
        prod[0][2]=3;
        prod[0][3]="kilo";
        prod[1][0]="P001";
        prod[1][1]="manzana";
        prod[1][2]=3;
        prod[1][3]="inid%";

        System.out.println("codigo\tnombre\tpre.Unit\tUnidMed");
        for (int i = 0; i < prod.length; i++) {
            System.out.println(prod[i][0]+"\t"+prod[i][0]+"\t"+prod[i][1]+"\t"+prod[i][2]+"\t"+prod[i][3]+"\t");

        }

    }

    public void sumadematrices() {
        int[][] mA={{3,-8},{5,9}};
        int[][] mB={{5,9},{1,-5}};
        int[][] mR=new int[mA.length][mA[0].length];
    for (int i = 0; i < mA.length; i++) {
        for (int j = 0; j < mA[0].length; j++) {
            mR[i][j]=mA[i][j]+mB[i][j];
        }
    }
    imprimirMatrix(mR);
}

public void imprimirMatrix(int[][] m) {
    for (int i = 0; i < m.length; i++) {
        for (int j = 0; j < m[0].length; j++) {
            System.out.print(m[i][j]+"\t");
        }
        System.out.println("");
    }
}
public void imprimirMatrix(Object[][] m) {
    for (int i = 0; i < m.length; i++) {
        for (int j = 0; j < m[0].length; j++) {
            System.out.print(m[i][j]+"\t");
        }
        System.out.println("");
    }
}

    public static void main(String[] args) {
        /*new matricesejemplos().matricesbasicos();*/
        new matricesejemplos().sumadematrices();
    }
}
