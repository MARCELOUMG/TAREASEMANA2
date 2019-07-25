package P2_S2_T2;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
    Scanner t = new Scanner(System.in);
        System.out.println("Ingresa la primera nota: ");
        double n1 = Double.parseDouble(t.nextLine());
         System.out.println("Ingresa la segunda nota: ");
         double n2 = Double.parseDouble(t.nextLine());
            System.out.println("Ingresa la tercera nota: ");
            double n3 = Double.parseDouble(t.nextLine());
    double med = (n1+n2+n3)/3;
    System.out.printf("La media de %.2f, %.2f y %.2f = %.2f: ", n1, n2, n3, med);
    }
}
