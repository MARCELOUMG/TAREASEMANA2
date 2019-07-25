package P2_S2_T3;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
    Scanner t = new Scanner(System.in);
        
System.out.println("Introduce un número ");
double base = Double.parseDouble(t.nextLine());
    int cont;
System.out.printf("%15s %15s %15s \n", "Número", "Cuadrado", "Cubo");
for (cont = 1; cont < 6; cont++){
      double cuadrado = Math.pow(base, 2);
      double cubo = Math.pow(base, 3);
      System.out.printf("%15f %15f %15f \n", base, cuadrado, cubo);
      base++;
  }
 }
}
