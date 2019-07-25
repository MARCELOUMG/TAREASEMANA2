package P2_S2_T1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        
        short shora=12,horas;
        float salarios;
        
        Scanner h = new Scanner(System.in);
    
        System.out.println("Ingresa las horas trabajadas durante la semana: ");
        horas=h.nextShort();
        
        salarios=(float) (horas*shora);
        
        System.out.println("Tu salario semanal es de: "+salarios+" Euros");
    }
}
