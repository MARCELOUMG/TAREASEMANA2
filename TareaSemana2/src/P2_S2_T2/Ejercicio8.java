package P2_S2_T2;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
    String bol = "a";
    Scanner t = new Scanner(System.in);
    
    System.out.println("Ingrese la primera nota: ");
    double n1 = Double.parseDouble(t.nextLine());
    System.out.println("Ingrese la segunda nota: ");
    double n2 = Double.parseDouble(t.nextLine());
    System.out.println("Ingrese la tercera nota: ");
    double n3 = Double.parseDouble(t.nextLine());
    
    double media = (n1+n2+n3)/3;
   
    if (media < 5){
      bol = "Insuficiente";
    } else if (media < 6){
      bol = "Suficiente";
    } else if (media < 7){
      bol = "Bien";
    } else if (media < 9){
      bol = "Notable";
    } else if (media <= 10){
      bol = "Sobresaliente";
    } else {
      System.out.println("Te equivocaste en una ");
    }
    System.out.printf("Su nota en el boletín es: %s. ", bol);
    }
}
