package P2_S2_T3;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
    Scanner t = new Scanner(System.in);
        
System.out.println("Ingresa la altura: ");
int h = Integer.parseInt(t.nextLine());    
System.out.println("Ingresa un caracter: ");
String run = t.nextLine();
    
    for (int fil = 0; fil < h; ++fil) {
      for (int col = 0; col < h-fil-1; ++col) {
        System.out.print(" ");
      }
      for (int col = 0; col < 2*fil+1; ++col) {
        System.out.print(run);
      }
      System.out.println();
  }
 }
}
