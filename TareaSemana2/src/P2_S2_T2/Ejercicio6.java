package P2_S2_T2;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
    double A = 9.81;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese la Altura: ");
    double B = Double.parseDouble(teclado.nextLine());
    double tiempo = Math.sqrt((2*B)/A);
    System.out.printf("Un objeto a una altura %f, tarda %.3f segundos en caer ", B, tiempo);
    }
}
