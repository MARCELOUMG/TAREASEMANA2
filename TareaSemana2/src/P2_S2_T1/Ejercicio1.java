package P2_S2_T1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        short n1,n2;
        short mult;
    Scanner m = new Scanner(System.in);
    
        System.out.println("Ingresa un número: ");
        n1=m.nextShort();
        System.out.println("Ingresa otro número: ");
        n2=m.nextShort();
        
        mult=(short) (n1*n2);
        
        System.out.println("El resusltado de la Multiplicacion es: "+mult);        
    }
}
