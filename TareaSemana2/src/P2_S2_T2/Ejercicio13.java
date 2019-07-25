package P2_S2_T2;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
    Scanner t =  new Scanner(System.in);
        
System.out.println("Ingrese un número: ");
int a = Integer.parseInt(t.nextLine());
    
System.out.println("Ingrese un número: ");
int b = Integer.parseInt(t.nextLine());
    
System.out.println("Ingrese un número: ");
int c = Integer.parseInt(t.nextLine());
    
System.out.print("De Menor a Mayor: ");
    
    if ((a <= b) && (a <= c)){
      System.out.print(a + " < ");
      if (b <= c){
        System.out.print(b + " < " +c);
      } else {
        System.out.print(c + " < " + b);
      }
    } else if ((b <= a) && (b <= c)){
      System.out.print(b + " < ");
      if (a <= c){
        System.out.print(a + "<" + c);
      } else {
        System.out.print(c + "<" + a);
      }
    } else if ((c <= a) && (c <= b)){
      System.out.print(c +" < ");
      if (a <= b){
        System.out.print(a + " < " + b);
      } else {
        System.out.print(b + " < " + a);
      }
    }
  }
}
