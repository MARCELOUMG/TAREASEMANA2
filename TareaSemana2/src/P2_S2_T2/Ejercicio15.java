package P2_S2_T2;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
    Scanner t = new Scanner(System.in);
        
    System.out.print("Ingresa un caracter ASCII para dibujar la pirámide: ");
    String run = t.nextLine();
    
    System.out.println("Como queres que salga la pirámide: ");
    System.out.println(" 1. Hacia arriba \n 2. Hacia abajo \n 3. Hacia la derecha \n 4. Hacia la izquierda \n");
    int form = Integer.parseInt(t.nextLine());
    
    switch (form){
      case 1:
        System.out.println("    " + run);
        System.out.println("   " + run + run + run);
        System.out.println("  " + run + run + run + run + run);
        System.out.println(" " + run + run + run + run + run + run + run);
        System.out.println(run + run + run + run + run + run + run + run + run);
        break;
      case 2:
        System.out.println(run + run + run + run + run + run + run + run + run);
        System.out.println(" " + run + run + run + run + run + run + run);
        System.out.println("  " + run + run + run + run + run);
        System.out.println("   " + run + run + run);
        System.out.println("    " + run);
        break;
      case 3:
        System.out.println("    " + run);
        System.out.println("   " + run + run);
        System.out.println("  " + run + run + run);
        System.out.println(" " + run + run + run + run);
        System.out.println(run + run + run + run + run);
        System.out.println(" " + run + run + run + run);
        System.out.println("  " + run + run + run);
        System.out.println("   " + run + run);
        System.out.println("    " + run);
        break;
      case 4:
        System.out.println(run + "    ");
        System.out.println(run + run + "   ");
        System.out.println(run + run + run + "  ");
        System.out.println(run + run + run + run + " ");
        System.out.println(run + run + run + run + run);
        System.out.println(run + run + run + run + " ");
        System.out.println(run + run + run + "  ");
        System.out.println(run + run + "   ");
        System.out.println(run + "    ");
        break;
      default:
        System.out.println("NO se puede así");
    }
  }
}
