package P2_S2_T2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Ingresa un número (del 1 al 7): ");
    int dia= 0;
    dia = Integer.parseInt(t.nextLine());
   
    switch (dia){
        case 1:
          System.out.println("Lunes");
          break;
        case 2:
          System.out.println("Martes");
          break;
        case 3:
          System.out.println("Miércoles");
          break;
        case 4:
          System.out.println("Jueves");
          break;
        case 5:
          System.out.println("Viernes");
          break;
        case 6:
          System.out.println("Sábado");
          break;
        case 7:
          System.out.println("Domingo");
          break;
        default:
          System.out.println("DEL 1 AL 7");
    }
    }
}
