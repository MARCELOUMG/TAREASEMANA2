package P2_S2_T3;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
    Scanner t = new Scanner(System.in);
        
System.out.println("Digite número entero positivo ");
int n = Integer.parseInt(t.nextLine());
    
    if (n < 0){
      System.out.println("NO ES POSITIVO");
    } else {
      System.out.println("La suma de siguientes 100 números a "+n+" son: ");
      int sum = 0;
      for(int i = n; i < (n+100); i++){
        sum += i;
      }
      System.out.print(sum);
    }
  }
}
