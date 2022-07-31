package com.manuel.ejercicio3;
import java.io.*;


/**
 *
 * @author Manuel Cervantes
 */
public class Sort {
    
    /*
    Método que implementa el ordenamiento de un Array mediante
    BubbleSort
    */
    public static void bubbleSort(int[] Array){
        for(int i=0; i<Array.length;i++){
            for (int j = 0; j < Array.length - i - 1; j++){
                if (Array[j] > Array[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = Array[j];
                    Array[j] = Array[j + 1];
                    Array[j + 1] = temp;
                }
            }
        }
    }
    
    /*
    Función la cual hace parte del método QuickSort
    e intercambia posiciones dentro de un arreglo
    */
  
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    
    /*
    Función la cual hace parte del método QuickSort
    y crea particiones del arreglo.
    */
    public static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high]; 
        int i = (low - 1); 

        for(int j = low; j <= high - 1; j++)
        {

            if (arr[j] < pivot) 
            {
                i++; 
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
  
/* Función que implementa el método de ordenamiento QuickSort
          arr[] --> Array a ordenar,
          low --> Index inicial,
          high --> Index final
 */
static void quickSort(int[] arr, int low, int high)
{
    if (low < high) 
    {
        int pi = partition(arr, low, high);
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}

/*
Función dedicada a imprimir un Array
*/
    public static void printArray(int[] Array){
        for(int i=0; i<Array.length; i++){
            System.out.print(Array[i] + " ");
        }   
    }
    

}
