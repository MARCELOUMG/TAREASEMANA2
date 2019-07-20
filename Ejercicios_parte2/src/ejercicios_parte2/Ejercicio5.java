package ejercicios_parte2;

public class Ejercicio5 {
public static void main(String[] args) {
    String a = "\033[35m";
    String b = "\033[34m";
    String c = "\033[33m";
        
    System.out.println(c+"Hora      Sabado");
    System.out.printf("%s      %-8s\n",  "07.00", "Fisica II");
    System.out.printf("%s      %-8s\n",  "09.00", "Micro-Económia");
    System.out.printf("%s      %-8s\n",  "11.00", "Programacion II");
    System.out.printf("%s      %-8s\n",  "14.00", "Calculo II");
    System.out.printf("%s      %-8s\n",  "16.00", "Estadistica I");
    }    
}
