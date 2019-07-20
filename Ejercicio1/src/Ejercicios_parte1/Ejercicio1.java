package Ejercicios_parte1;

public class Ejercicio1 {

    public static void main(String[] args) {
        short x=144;
        short y=999;
        short sum, res, mult, div;
        
        sum=(short) (x+y);
        res=(short) (x-y);
        mult=(short) (x*y);
        div=(short) (x/y); 
        
        System.out.print(x);
        System.out.println("\t"+y);
        System.out.println("La Suma de ambos datos es: "+sum);
        System.out.println("La Resta de ambos datos es: "+res);
        System.out.println("La Multiplicacion de ambos datos es: "+mult); 
        System.out.println("La Division de ambos datos es: "+div);
    }
    
}
