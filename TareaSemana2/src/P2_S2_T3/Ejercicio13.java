package P2_S2_T3;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
    Scanner t = new Scanner(System.in);
    
    int cifras = Integer.parseInt(t.nextLine());
    int num = 10;
    int positivo = 0;
    int nega = 0;
    for (int cont = 0; cont < num; cont++){
      if (cifras < 0){
        positivo ++;
      } else {
        nega++;
      }
    }
    System.out.println("Hay "+positivo+" positivios y "+nega+" negativos.");
  }
}
