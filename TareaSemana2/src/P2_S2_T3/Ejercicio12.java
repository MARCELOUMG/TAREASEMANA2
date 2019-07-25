package P2_S2_T3;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
    int c; 
Scanner t = new Scanner(System.in);
    do {
System.out.println("Ingresa un número ");
c = Integer.parseInt(t.nextLine());
    } while (c <= 2);
    int n1 = 0;
    int n2 = 1;
    int fi = 0;
System.out.print("Las primeras "+c+" de la serie de Fibonacci son: "+ n1+" "+n2+ " ");
for (int i = 0; i < (c-2); i++){
      fi = n1 + n2;
System.out.print(" "+fi+" ");
      n1 = n2;
      n2 = fi;
  }
 }
}
