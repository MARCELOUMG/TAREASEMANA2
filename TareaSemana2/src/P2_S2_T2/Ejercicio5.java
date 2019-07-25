package P2_S2_T2;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
       int x = 0;
       Scanner teclado = new Scanner (System.in); 
    System.out.println("Ingresa una variable: ");
    int v1 = Integer.parseInt(teclado.nextLine());  
    System.out.println("Ingresa otra variable: ");
    int v2 = Integer.parseInt(teclado.nextLine());  
    x = (-v2)/v1;
    System.out.printf("En %dx + %d = 0, x = %d", v1, v2, x);
    }
}
