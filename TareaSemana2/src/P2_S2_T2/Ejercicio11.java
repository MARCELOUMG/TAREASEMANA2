package P2_S2_T2;

import java.util.Scanner;

public class Ejercicio11 {
   public static void main(String[] args) {
      Scanner t = new Scanner(System.in);
      System.out.println("Ingrese la hora: ");
    int hora = Integer.parseInt(t.nextLine());
    if ((0 < hora) && (hora > 23)) {
      System.out.println("No esta bien ingresado");
    } else {
      System.out.println("Ingrese los minutos: ");
      int min = Integer.parseInt(t.nextLine());
        if ((0 < min) && (min > 59)) {
          System.out.println("No esta bien ingresado");
        } else {
        
        if ((hora == 0) && (min == 0)){
          System.out.println("Ya es tarde es medianoche");
        
        } else {
          int horaS = (23 - hora)* 3600;
          int minS = (60 - min)* 60;
          int medianoche = horaS + minS;
          System.out.println("Faltan " + medianoche + " segundos para medianoche");
        }
      }
    }
  } 
}
