package P2_S2_T3;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
    Scanner t = new Scanner(System.in);
double num = 0,div = 0,cont = 0;
    do{
System.out.println("Ingrese un número: ");
      num = Double.parseDouble(t.nextLine());
      div = div + num;
      cont++;
    } while (div < 10000);
    div -= num;
    double media = (div-num)/(cont-2);
System.out.println("Ingresaste "+cont+" números.");
System.out.println("La suma de los números es: "+div+".");
System.out.println("La media es: "+ media +".");
  }
}
