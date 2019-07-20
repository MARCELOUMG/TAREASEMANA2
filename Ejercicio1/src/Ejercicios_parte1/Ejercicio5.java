package Ejercicios_parte1;

import java.util.Scanner;

public class Ejercicio5 {
public static void main(String[] args){

    Scanner entrada= new Scanner(System.in);
    
    float quetzal, resultado;
    float euro=(float) 0.12;
    
    System.out.println("Ingresa un Numero:");
    quetzal = entrada.nextFloat();
    
    resultado=(float) quetzal*euro;
    
    System.out.println(quetzal+ " Quetzales sera igual a "+resultado+" Euros");
    
}    
}
