package P2_S2_T1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        short b,h;
        short mult;
    Scanner t = new Scanner(System.in);
    
        System.out.println("Ingresa la base del Triangulo: ");
        b=t.nextShort();
        System.out.println("Ingresa la altura del Triangulo: ");
        h=t.nextShort();
        
        mult=(short) ((b*h)/2);
        
        System.out.println("El Área del Triangulo es: "+mult);
    }
}
