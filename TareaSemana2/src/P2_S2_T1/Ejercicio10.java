package P2_S2_T1;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner conver= new Scanner(System.in);
    
    int mb, resultado;
    int kb= 1024;
    
    System.out.println("Ingresa la cantidad en MegaBytes:");
    mb = conver.nextInt();
    
    resultado=(int) mb*kb;
    
    System.out.println(mb+ " MegaBytes sera igual a "+resultado+" KiloBytes");
    }
}
