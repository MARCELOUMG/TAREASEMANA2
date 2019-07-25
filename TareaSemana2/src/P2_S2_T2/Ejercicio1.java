package P2_S2_T2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        String dia;
    /* Recoge dia de la semana */
    Scanner tec = new Scanner(System.in);
    System.out.print("Escribe el dia de la semana que deseas consultar: ");
    dia = tec.nextLine(); 
    switch (dia){
        case "lunes":
        case "miércoles":
          System.out.print("Lengua y Literatura");
          break;
        case "martes":
        case "jueves":
        case "viernes":
          System.out.print("Matemáticas");
          break;
        case "sábado":
        case "domingo":
          System.out.print("No hay clases siiii!");
        default:
          System.out.print("¿Acaso te lo dije en otro idioma?");
    }
   }
}
