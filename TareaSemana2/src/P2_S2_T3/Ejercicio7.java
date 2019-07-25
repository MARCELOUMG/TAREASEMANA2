package P2_S2_T3;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
    int a = 4;    
    int comb = 4321;
    int combinacio;
    boolean v = false;
    Scanner teclado = new Scanner(System.in);
    do {
      System.out.print("Combinación: ");
      combinacio = Integer.parseInt(teclado.nextLine());
      if (combinacio == comb) {
        v = true;
      } else {
        System.out.println("Lo siento, no es laCombinación");
      }
      a--;
    } while((a > 0) && (!v));
    if (v) {
      System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
    } else {
      System.out.println("Se te acabaron las oportunidades, nos quedaremos con lo que habia adentro");
    }
    }
}
