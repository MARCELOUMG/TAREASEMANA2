package P2_S2_T1;

import java.util.Scanner;

public class Ejercicio5 {
     public static void main(String[] args) {
     
        short b,h;
        short mult;
    Scanner r = new Scanner(System.in);
    
        System.out.println("Ingresa la base del Rectangulo: ");
        b=r.nextShort();
        System.out.println("Ingresa la altura del Rectangulo: ");
        h=r.nextShort();
        
        mult=(short) (b*h);
        
        System.out.println("El Área del Rectangulo es: "+mult);
         
     }
}
