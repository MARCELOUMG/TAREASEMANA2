package P2_S2_T1;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
           Scanner conver= new Scanner(System.in);
    
    int kb, resultado;
    int mb= 1024;
    
    System.out.println("Ingresa la cantidad en KiloBytes:");
    kb = conver.nextInt();
    
    resultado=(int) kb/mb;
    
    System.out.println(kb+ " KiloBytes sera igual a "+resultado+" MegaBytes");
    }
}
