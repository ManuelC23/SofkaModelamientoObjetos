package com.manuel.ejercicio3;

import java.util.Scanner;

/**
 * Programa que crea un Array de N números aleatorios y posteriormente le 
 * solicita al usuario cómo desea ordenarlos.
 * @author Manuel Cervantes
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, how many random numbers do you want in your array? ");
        Scanner numberInput = new Scanner(System.in);
        int num = numberInput.nextInt();
        int[] numArray = new int[num]; // Creación del Array según la cantidad de números que el usuario determine
        
        /*
        Bucle for para llenar el Array con números aleatorios
        */
        for(int i=0; i<numArray.length; i++){
            numArray[i] = (int)(Math.random()*100);
        }
        
        System.out.println("Would you like to sort using Bubble Sort or Quick Sort? \n 1- Bubble Sort 2- Quick Sort");
        Scanner sortInput = new Scanner(System.in);
        int sort = sortInput.nextInt();
        if(sort == 1){
            Sort.bubbleSort(numArray);
            Sort.printArray(numArray);
        } else if (sort == 2) {
            Sort.quickSort(numArray, 0, numArray.length-1);
            Sort.printArray(numArray);
        }
  
    }
}
