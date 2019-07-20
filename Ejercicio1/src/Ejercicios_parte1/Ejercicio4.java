package Ejercicios_parte1;

import java.util.Scanner;

public class Ejercicio4 {
public static void main(String[] args){

    Scanner entrada= new Scanner(System.in);
    
    float euros, resultado;
    float quetzal=(float) 8.61;
    
    System.out.println("Ingresa un Numero:");
    euros = entrada.nextFloat();
    
    resultado=(float) euros*quetzal;
    
    System.out.println(euros+ " Euros sera igual a "+resultado+" Quetzales");
    
}
    
}
