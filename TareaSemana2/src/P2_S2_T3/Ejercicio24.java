
package P2_S2_T3;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
Scanner t = new Scanner(System.in);
System.out.println("Ingrese la altura: ");
int h = Integer.parseInt(t.nextLine());
  for (int fil = 0; fil <= h; ++fil) {
  for (int col = 0; col <= h-fil-1; ++col) {
System.out.print(" ");
      }
int num = fil-1;
  for (int col = 1; col < 2*fil; ++col) {
  if (col <= fil){
System.out.print(col);
      }
  if (col > fil){
System.out.print(num);
  num--;
     }
    }
System.out.println();
  }
 }
}
