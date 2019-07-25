package P2_S2_T3;

public class Ejercicio22 {
    public static void main(String[] args) {
    boolean pr = false;
System.out.println("Los números primos entre 2 y 100 son:");
for (int num = 2; num <= 100; num++) {
      pr = true;
      for (int i = 2; i < num; i++){
        if (num%i == 0){
          pr = false;
        }
      }
      if (pr){
        System.out.print("-"+num);
      }  
    } 
  }
}
