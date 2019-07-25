package P2_S2_T1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner cambio= new Scanner(System.in);
    
    float pesetas, resultado;
    float euro=(float) 166.386;
    
    System.out.println("Ingresa la cantidad en Pesetas:");
    pesetas = cambio.nextFloat();
    
    resultado=(float) pesetas/euro;
    
    System.out.println(pesetas+ " Pesetas sera igual a "+resultado+" Euros");
    }
}
