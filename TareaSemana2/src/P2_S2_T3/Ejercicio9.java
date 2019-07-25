package P2_S2_T3;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
    Scanner t = new Scanner(System.in);
        
        System.out.print("Digita un número ");
        int n = Integer.parseInt(t.nextLine());
        int i;
        for (i = 0; n > 0; i++){
            n = n/10;
    }
    System.out.println("El número tiene "+i+" cifras.");
    }
}
