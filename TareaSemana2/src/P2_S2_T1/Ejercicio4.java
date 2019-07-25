package P2_S2_T1;

import java.util.Scanner;

public class Ejercicio4 {
   public static void main(String[] args) {
    short n1,n2;
        short sum,rest,mult,div;
    Scanner m = new Scanner(System.in);
    
        System.out.println("Ingresa un número: ");
        n1=m.nextShort();
        System.out.println("Ingresa otro número: ");
        n2=m.nextShort();
        
        sum=(short) (n1+n2);
        rest=(short) (n1-n2);
        mult=(short) (n1*n2);
        div=(short) (n1/n2);
        
        System.out.print(n1);
        System.out.println("\t"+n2);
        System.out.println("La Suma de ambos datos es: "+sum);
        System.out.println("La Resta de ambos datos es: "+rest);
        System.out.println("La Multiplicacion de ambos datos es: "+mult); 
        System.out.println("La Division de ambos datos es: "+div);
   }
}
