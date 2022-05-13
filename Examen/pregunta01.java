import java.util.Scanner;

public class pregunta1{
    
  public static void main(String args[]){
    Scanner in = new Scanner (System.in);
    //definir variables
    double nota =0, examen1 =0, examen2 =0, examen3 =0;
    //datos de entrada
    System.out.print("cual es la nota del postulante: ");
    nota = in.nextInt();
    if(nota>=17 && nota<=20){
      examen1 = nota * 0.40;
      examen2 = nota * 0.35;
      examen3 = nota * 0.25;
      System.out.println("en el examen de concimiento saco una nota de  :"+examen1);
      System.out.println("en la entrevista personal saco una nota de : "+examen2);
      System.out.println("en examen psicologico saco una nota de : "+examen3);
      System.out.println("la suma de los puntajes del estudiante es: "+nota);
      System.out.print("el nivel del estudiante es 4 y obtinene la veca ");
    }else if(nota<17 && nota>=14){
      examen1 = nota*0.40;
      examen2 = nota*0.35;
      examen3 = nota*0.25;
      System.out.println("en el examen de concimiento saco una nota de  :"+examen1);
      System.out.println("en la entrevista personal saco una nota de : "+examen2);
      System.out.println("en examen psicologico saco una nota de : "+examen3);
      System.out.println("la suma de los puntajes del estudiante es: "+nota);
      System.out.print("el nivel del estudiante es 3 y obtinene la veca ");
    }else if(nota<14 && nota >=11){
      examen1 = nota*0.40;
      examen2 = nota*0.35;
      examen3 = nota*0.25;
      System.out.println("en el examen de concimiento saco una nota de  :"+examen1);
      System.out.println("en la entrevista personal saco una nota de : "+examen2);
      System.out.println("en examen psicologico saco una nota de : "+examen3);
      System.out.println("la suma de los puntajes del estudiante es: "+nota);
      System.out.print("el nivel del estudiante es 2 y obtinene la veca ");
    }else if(nota<11){
      examen1 = nota*0.40;
      examen2 = nota*0.35;
      examen3 = nota*0.25;
      System.out.println("en el examen de concimiento saco una nota de  :"+examen1);
      System.out.println("en la entrevista personal saco una nota de : "+examen2);
      System.out.println("en examen psicologico saco una nota de : "+examen3);
      System.out.println("la suma de los puntajes del estudiante es: "+nota);
      System.out.print("el nivel del estudiante es 1 y no obtinen veca ");
      
    }else{
      System.out.print("Error, la nota no existe .");
    }
  }
}