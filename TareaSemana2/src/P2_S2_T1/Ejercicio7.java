package P2_S2_T1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
    Scanner t = new Scanner(System.in);
System.out.print("Introduzca la base imponible (precio sin IVA): ");
    double bi = Double.parseDouble(t.nextLine());

System.out.printf("Base imponible %8.2f\n", bi);
System.out.printf("IVA            %8.2f\n", (bi * 0.12));
System.out.printf("-----------------------\n");
System.out.printf("Total          %8.2f\n", (bi * 1.12));
    }
}
