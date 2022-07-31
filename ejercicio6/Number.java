package com.manuel.ejercicio6;
import java.util.Scanner;

/**
 *
 * @author Manuel Cervantes
 */
public class Number {
    private int Number;

    /*
    Constructor de la clase Number
    */
    private Number(int Number) {
        this.Number = Number;
    }
    
    /*
    Método para agregar un Número
    */
    
    public static Number addNumber(){
        int number;
        Scanner numberInput = new Scanner(System.in);
        number = numberInput.nextInt();
        return new Number(number);
    }    

    /**
     * @return the Number
     */
    public int getNumber() {
        return Number;
    }

    /**
     * @param Number the Number to set
     */
    private void setNumber(int Number) {
        this.Number = Number;
    }

    
}
