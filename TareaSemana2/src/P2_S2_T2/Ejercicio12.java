package P2_S2_T2;

import java.util.Scanner;

public class Ejercicio12 {
public static void main(String[] args) {
    int puntos = 0;
    Scanner t = new Scanner(System.in);
   
    System.out.println("\n CUESTIONARIO DE 10 PREGUNTAS:\n");
    
    System.out.println(" 1) ¿Como declaro una variable con decimales? ");
    System.out.println("a) string");
    System.out.println("b) short");
    System.out.println("c) float");
    String respuesta = t.nextLine();
    
    if (respuesta.equals("c")) {
      puntos++;
      System.out.println("¡La primera siempre es facil!");
    } else {
      System.out.println("Nel perro te equivocaste");
    }    
    System.out.println("\n 2) ¿Cuál NO es un Lenguaje de Programación?");
    System.out.println("a) Phyton");
    System.out.println("b) c++");
    System.out.println("c) tu mamá");
    respuesta = t.nextLine();
    
    if (respuesta.equals("c")) {
      puntos++;
      System.out.println("¡Conoces del tema!");
    } else {
      System.out.println("Nel perro te equivocaste");
    }
    System.out.println("\n 3) ¿Como se llama el inge? ");
    System.out.println("a) Jaime");
    System.out.println("b) Ruldin");
    System.out.println("c) Alejandro");
    respuesta = t.nextLine();
    if (respuesta.equals("b")) {
      puntos++;
      System.out.println("¡Si pones atención!");
    } else {
      System.out.println("Nel perro te equivocaste");
    }
    System.out.println("\n 4) ¿Como declaro una cadena?");
    System.out.println("a) string");
    System.out.println("b) float");
    System.out.println("c) char");
    respuesta = t.nextLine();
    if (respuesta.equals("a")){
      puntos++;
      System.out.println("Estiaste vos");
    } else {
      System.out.println("Nel perro te equivocaste");
    }
    System.out.println("\n 5) ¿Para que sirve *?");
    System.out.println("a) salto de linea");
    System.out.println("b) multiplicación");
    System.out.println("c) puro adorno");
    respuesta = t.nextLine();
    if (respuesta.equals("b")){
      puntos++;
      System.out.println("¡si sabes programar!");
    } else {
      System.out.println("Nel perro te equivocaste");
    }
    System.out.println("\n 6) ¿De que color son las presentaciones del Inge?");
    System.out.println("a) Verdes");
    System.out.println("b) Nunca me he dado cuenta");
    System.out.println("c) Que presentaciones?");
    respuesta = t.nextLine();
    if (respuesta.equals("a")){
      puntos++;
      System.out.println("Lo sabes solo porque les tomas fotos para las tareas");
    } else {
      System.out.println("No pones atencion va");
    }
    System.out.println("\n 7) ¿Cual de las siguientes no es una base de datos?");
    System.out.println("a) Access");
    System.out.println("b) Word");
    System.out.println("c) SQL");
    respuesta = t.nextLine();
    if (respuesta.equals("b")){
      puntos++;
      System.out.println("De seguro lo buscaste en Google");
    } else {
      System.out.println("Ponete a estudiar");
    }
    System.out.println("\n 8) ¿Es el Sobrino de mi tio, pero no es mi hermano?");
    System.out.println("a) Yo mismo");
    System.out.println("b) Soy adoptado");
    puntos++;
    respuesta = t.nextLine();
    if (respuesta.equals("a")){
      System.out.println("¡La pensaste un rato!");
    } else {
      System.out.println("Shido XD");
    }
    System.out.println("\n 9) ¿Que es java?");
    System.out.println("a) Un personaje de Star Wars");
    System.out.println("b) Lenguaje de Programación");
    respuesta = t.nextLine();
    if (respuesta.equals("b")){
      puntos++;
      System.out.println("¡seeee!");
    } else {
      System.out.println("Casi... pero hablamos de computadoras");
    }
    System.out.println("\nYa has trabajado mucho asi que esta va facil\n 10) ¿Quien invento el termino -Ingenieria de Software-?");
    System.out.println("a) Margaret Hamilton");
    System.out.println("b) Descansa un Poco");
    System.out.println("c) Regresa a la primera");
    
    respuesta = t.nextLine();
    
    if (respuesta.equals("a")){
      puntos++;
      System.out.println("¡Felicidades!");
    } else {
      System.out.println("Suerte para la proxima");
    }
    //Puntos
    System.out.println("\n La puntuación que ha sacado en este Cuestionario es de: " + puntos);
    if (puntos < 5){
      System.out.println("Ah... Aplicate más");
    } else if (puntos < 7){
      System.out.println("Estas entre el Promedio");
    } else if (puntos <= 10){
      System.out.println("¡Master!");
    }
    }    
}
