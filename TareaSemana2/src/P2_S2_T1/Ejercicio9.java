package P2_S2_T1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        double r,r2,h,vol,mult;
        double pi=3.1416;
        
    Scanner v = new Scanner(System.in);
    
        System.out.println("Ingresa el radio del cono: ");
        r=v.nextShort();
        System.out.println("Ingresa la altura del cono: ");
        h=v.nextShort();
        
        r2=(double) (r*r);
        mult=(double) ((r2*h)/3);
        vol=(double) (mult*pi);
        
        System.out.println("El Volumen del cono es: "+vol);
    }
}
