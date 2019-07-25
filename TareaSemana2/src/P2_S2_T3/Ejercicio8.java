package P2_S2_T3;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
    Scanner t = new Scanner(System.in);
        
System.out.print("Ingresa un número ");
int num = Integer.parseInt(t.nextLine());
System.out.println("Tabla de multiplicar del número "+num+"\n");
for (int i = 1; i<= 10; i++){
System.out.println(num+" x "+i+" = "+num*i);
}
}
}
