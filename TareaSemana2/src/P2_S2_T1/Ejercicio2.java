package P2_S2_T1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner cambio= new Scanner(System.in);
    
    float euros, resultado;
    float pesetas=(float) 166.386;
    
    System.out.println("Ingresa la cantidad en Euros:");
    euros = cambio.nextFloat();
    
    resultado=(float) euros*pesetas;
    
    System.out.println(euros+ " Euros sera igual a "+resultado+" Pesetas");
}    
}
