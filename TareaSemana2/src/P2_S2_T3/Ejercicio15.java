package P2_S2_T3;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
    Scanner t = new Scanner(System.in);
        
System.out.println("Ingrese un numero base ");
double base = Double.parseDouble(t.nextLine());
    
    System.out.println("Ingese un Exponente (Positivo) ");
    int exponente = Integer.parseInt(t.nextLine());
    
    double total = 1;
    for(int i = 0; i < exponente; i++){
      total = base * total;
      System.out.println(base+ " elevado a "+ exponente+" = "+total+".");
    }
  }
}
