package P2_S2_T3;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
Scanner t = new Scanner(System.in);
        
System.out.println("Digita un número: ");
int n1 = Integer.parseInt(t.nextLine());
System.out.println("Digita un número diferente: ");
    int n2 = Integer.parseInt(t.nextLine());
    if (n1 == n2){
System.out.println("Debe ser difrente");
    } else {
      int menor = 0;
      int mayor = 0;
      int i = 0;
      if (n1 < n2){
        menor = n1;
        mayor = n2;
      } else {
        menor = n2;
        mayor = n1;
      }
      for(i = 0; menor < mayor; i++){
        menor+= 7;
      }
System.out.println("El número 7 cabe "+(i-1)+" veces entre el "+n1+" y el "+n2);
  }
 }
}
