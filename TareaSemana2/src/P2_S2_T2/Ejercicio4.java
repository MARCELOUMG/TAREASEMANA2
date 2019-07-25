
package P2_S2_T2;

import java.util.Scanner;

public class Ejercicio4 {
     public static void main(String[] args) {
        
        short shora=12,horas,horase,shorae=16;
        float salarios;
        
        Scanner h = new Scanner(System.in);
    
        System.out.println("Ingresa las horas trabajadas durante la semana: ");
        horas=h.nextShort();
        
        if (horas <= 40){
            salarios=(float) (horas*shora);
            System.out.println("Tu salario semanal es de: "+salarios+" Euros");
        }
        else if (horas > 40){
            horase=(short) (horas-40);
            salarios=(float) ((40*shora)+horase*shorae);
            System.out.println("Tu salario semanal es de: "+salarios+" Euros");
        }
    }
}
