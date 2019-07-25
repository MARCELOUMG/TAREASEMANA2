package P2_S2_T3;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
    Scanner t = new Scanner(System.in);
        
System.out.println("Introduce la altura: ");
int a = Integer.parseInt(t.nextLine());
System.out.println("Introduce el caracter: ");
String run = t.nextLine();
    
    for (int fil = 0; fil < a-1; ++fil) {
      for (int col = 0; col < a-fil-1; ++col) {
        System.out.print(" ");
      }
      for (int col = 0; col < 2*fil+1; ++col) {
        if ((col == 0) || (col == 2*fil)){
        System.out.print(run);
        }else { 
        System.out.print(" ");
        }
      }
      System.out.println();
    }
    for (int col = 0; col < 2*a-1; ++col) {
      System.out.print(run);
  }
 }
}
