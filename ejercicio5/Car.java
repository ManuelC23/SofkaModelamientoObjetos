package com.manuel.ejercicio5;

import java.util.Scanner;

/**
 * Representación de un Carro con herencia de la clase Vehicle.
 * @author Manuel
 */
public class Car extends Vehicle{
    
    private String typeOfGas; // Atributo de la clase Car
    
    /*
    Constructor de la clase Car
    */

    public Car(String typeOfGas, int passengers, boolean tripulation, String enrollmentDate, String meanOfTravel, String color, int kilometers, int wheels) {
        super(passengers, tripulation, enrollmentDate, meanOfTravel, color, kilometers, wheels);
        this.typeOfGas = typeOfGas;
    }

    /*
    Método para crear objetos de la clase Car
    */
    
    public static Vehicle createCar(){
            System.out.println("How many Passengers are in the Car? ");
            Scanner passengersInput = new Scanner(System.in);
            int passengers = passengersInput.nextInt();
            System.out.println("Please type your Car enrollment Date: ");
            Scanner enrollmentInput = new Scanner(System.in);
            String enrollmentDate = enrollmentInput.nextLine();
            System.out.println("Please type your Car color: ");
            Scanner colorInput = new Scanner(System.in);
            String color = colorInput.nextLine();
            System.out.println("Please type your Car type of gas: ");
            Scanner gasInput = new Scanner(System.in);
            String gas = gasInput.nextLine();
            System.out.println("Please type the kilometers of your Car: ");
            Scanner kilometersInput = new Scanner(System.in);
            int kilometers = kilometersInput.nextInt();
            return new Car(gas,passengers,false,enrollmentDate,"Road",color,kilometers,4);
    }
   
    @Override
    public void printVehicle(){
        System.out.println("Type of Vehicle: Car - Color: " + this.getColor() + 
                " - Kilometers: " + this.getKilometers() + 
                " - Type of Gas: " + this.getTypeOfGas() +
                " - Enrollment Date: " + this.getEnrollmentDate() + 
                " - Passengers: " + this.getPassengers() + ".");
    }
    
    /**
     * @return the typeOfGas
     */
    public String getTypeOfGas() {
        return typeOfGas;
    }

    /**
     * @param typeOfGas the typeOfGas to set
     */
    private void setTypeOfGas(String typeOfGas) {
        this.typeOfGas = typeOfGas;
    }
    
    
}
