package P2_S2_T3;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
    Scanner t = new Scanner(System.in);
    
    double divid = 0,mayor = 0,impar = 0,num;
    int contimp = 0,contador = 0;
    do{
System.out.println("Digite un número ");
num = Double.parseDouble(t.nextLine());
      
      if (num%2 != 0){
        impar = num;
        divid += num;
        contimp++;
      } else {
        if (num > mayor){
          mayor = num;
        }
      }
      contador++;
    } while (num > 0);
    double media = (divid-impar)/(contimp-1);
System.out.println("Ha introducido "+ contador + " números.");
System.out.println("La media de los impares es: "+ media +".");
System.out.println("El mayor número par es el: "+mayor+".");
 }
}
