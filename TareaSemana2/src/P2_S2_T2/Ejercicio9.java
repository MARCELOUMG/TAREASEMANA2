package P2_S2_T2;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        System.out.println("Ingrese la primera variable: ");
        double v1 = Double.parseDouble(t.nextLine());
            System.out.println("Ingrese la segunda variable: ");
            double v2 = Double.parseDouble(t.nextLine());
                System.out.println("Ingrese la tercera variable: ");
                double v3 = Double.parseDouble(t.nextLine());
        
    if ((v1 == 0) && (v2 != 0) && (v3 != 0)){
    double x = (-v2)/v1;
    System.out.printf("La solución de la ecuación %.2fx + %.2f = %.2f", v2, v3, x);
    } else {
    if ((4*v1*v3) > (v2*v2)){
    System.out.println("La ecuación no tiene solución en ℝ.");
    } else if ((v1 == 0) && (v2 == 0) && (v3 == 0)){
    System.out.println("La ecuación es una identidad.");
    } else {
          
          double x1 = (-v2 + Math.sqrt((v2*v2)-4*v1*v3))/(2*v1);
          double x2 = (-v2 - Math.sqrt((v2*v2)-4*v1*v3))/(2*v1);
          System.out.printf("Las soluciones de la ecuación %.2fx² + %.2fx + %.2f son x1= %.2f y x2= %.2f", v1, v2, v3, x1, x2);
            }
    }
  } 
}
