package com.manuel.ejercicio2;

/**
 *
 * @author Manuel Cervantes
 */
public class Main {

    /*
    Una clase en java puede tener múltiples métodos main SIEMPRE Y CUANDO estos no compartan los mismos parámetros, si tienen los mismos parámetros
    el JRE no sabrá por dónde comenzar, sin embargo, al ser distintos permite al JRE elegir cuál parámetro es solicitado y ejecutarlo, esto
    es gracias a la propiedad de Sobrecarga. Ahora, para ejecutar un programa el programador debe indicarle a Java por dónde empezar a ejecutar, es decir, 
    cual es la clase que debe iniciar; por defecto Java busca la clase llamada Main para ejecutarla, pero si esta no existe debe ser el programador quien 
    determine cuál es la clase por la cual el programa comenzará su ejecución.
    */
    
    public static void main(String[] args) {
        System.out.println("Hello World! I have a main archive with one specified parameter");
    }
    
    public static void main(String args2) {
        System.out.println("Hello World! I'm another main method but my parameters differ from the first one.");
    }
    
    public static void main(String args3, String args4) {
        System.out.println("Hello World! I'm the last main method and my parameters differ from the first and second one.");
    }
}
