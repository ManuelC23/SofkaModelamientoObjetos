package com.manuel.ejercicio6;
import java.util.Vector;

/**
 * Uso de la clase Vector para crear una clase que solicita al usuario introducir números en el Vector
 * y al detectar que un mismo número X se ha introducido consecutivamente, detiene la ejecución del
 * programa.
 * @author Manuel Cervantes
 */
public class Main {

    public static void main(String[] args) {
        Vector<Number> numeros = new Vector<>(1,1);
        System.out.println("Hello, please type your first number: ");
        numeros.add(Number.addNumber());
        System.out.println("The numbers in the array are the following:");
        System.out.print(numeros.get(0).getNumber()+ " ");
        for(int i=0; i<numeros.size(); i++){
            System.out.println("");
            System.out.println("Please type the next number you want to add: ");
            numeros.add(Number.addNumber());
            System.out.println("The numbers in the array are the following:");
            for(int j=0; j<numeros.size(); j++){
                System.out.print(numeros.get(j).getNumber()+ " - ");
            }
            if(numeros.get(i).getNumber() == numeros.get(i+1).getNumber()){
                System.out.println("The number you added: " + numeros.get(i).getNumber() + ", is equal to the previous number in the Vector: " + numeros.get(i).getNumber());
                break;
            }
        }
    }
}
