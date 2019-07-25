package P2_S2_T3;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
    boolean p = true;
    Scanner t = new Scanner(System.in);
    
System.out.println("Digite un Número");
int num = Integer.parseInt(t.nextLine());
  
    for (int i = 2; i < num; i++){
      if ((num%i) == 0){
        p = false;
      } else {
        p = true;
      }
    }
    System.out.println("El número digitado ");
    if (p == true){
      System.out.println("ES PRIMO");
    } else {
      System.out.println("NO ES PRIMO");
    }
  }
}
