package P2_S2_T2;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
    Scanner t = new Scanner(System.in);
    
    System.out.println("Ingrese un número: ");
    int num = Integer.parseInt(t.nextLine());
    
    String d = "no";
    String par = "no";
    
    if ((num % 5 == 0) && (num % 5 == 0)){
      d = " Si lo podes dividir entre 5 y tambien es par";
    } else if ((num % 5 != 0) && (num % 2 != 0)){
      d = " NO se puede dividir entre 5 y es impar.";
    }
   
    else if (num % 5 == 0){
      d = " Si lo podes dividir entre 5";
    } else if (num % 5 != 0){
      d = " O se puede dividir entre 5";
    } 
    
    else if (num % 2 == 0){
      d = " SI ES PAR";
    } else if (num % 2 != 0){
      d = " ES IMPAR";
    }
    System.out.print("El número " + num + d);
    }
}
