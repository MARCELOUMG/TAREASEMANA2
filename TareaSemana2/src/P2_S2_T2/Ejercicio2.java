package P2_S2_T2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int hora= 0;
         System.out.println("Ingresa la hora (Formato 24hrs.): ");
    hora = Integer.parseInt(t.nextLine());
   
    if ((hora >= 6)&&(hora <= 12)){
      System.out.println("Buenos Días");
    } 
    else if ((hora >= 13)&&(hora <= 20)){
      System.out.println("Buenas Tardes");
    } 
    else if ((hora >= 21)&&(hora <= 23)){
      System.out.println("Buenas Noches");
    } 
    else if ((hora >= 0)&&(hora <= 5)){
      System.out.println("Buenas Noches");
    } 
    else {
      System.out.print("No, no valido");
    }
    }
}
