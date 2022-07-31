package com.manuel.ejercicio5;

import java.util.Scanner;

/**
 * Representación de un Camión con herencia de la clase Vehículo.
 * @author Manuel Cervantes
 */
public class Truck extends Vehicle{
    
    
    private double height; // Atributo único de la clase Truck
    private String typeOfCargo;
    private String typeOfGas;

    /*
    Constructor de la clase Truck
    */
    
    public Truck(double height, String typeOfCargo, String typeOfGas, int passengers, boolean tripulation, String enrollmentDate, String meanOfTravel, String color, int kilometers, int wheels) {
        super(passengers, tripulation, enrollmentDate, meanOfTravel, color, kilometers, wheels);
        this.height = height;
        this.typeOfCargo = typeOfCargo;
        this.typeOfGas = typeOfGas;
    }

    /*
    Método de la clase Truck para crear un Camión
    */
    
    public static Vehicle createTruck(){
            System.out.println("How many Wheels has your truck? ");
            Scanner wheelsInput = new Scanner(System.in);
            int wheels = wheelsInput.nextInt();
            System.out.println("Please type the Height of your Truck (in meters): ");
            Scanner heightInput = new Scanner(System.in);
            double height = heightInput.nextDouble();
            System.out.println("Please type the type of Cargo of your Truck: ");
            Scanner cargoInput = new Scanner(System.in);
            String cargo = cargoInput.nextLine();
            System.out.println("How many Passengers are in the Truck? ");
            Scanner passengersInput = new Scanner(System.in);
            int passengers = passengersInput.nextInt();
            System.out.println("Please type your Truck enrollment Date: ");
            Scanner enrollmentInput = new Scanner(System.in);
            String enrollmentDate = enrollmentInput.nextLine();
            System.out.println("Please type your Truck color: ");
            Scanner colorInput = new Scanner(System.in);
            String color = colorInput.nextLine();
            System.out.println("Please type your Truck type of gas: ");
            Scanner gasInput = new Scanner(System.in);
            String gas = gasInput.nextLine();
            System.out.println("Please type the kilometers of your Truck: ");
            Scanner kilometersInput = new Scanner(System.in);
            int kilometers = kilometersInput.nextInt();
            return new Truck(height,cargo,gas,passengers,false,enrollmentDate,"Road",color,kilometers,wheels);
    }
    
    @Override
    public void printVehicle(){
        System.out.println("Type of Vehicle: Truck" + 
                " - Color: " + this.getColor() + 
                " - Kilometers: " + this.getKilometers() + 
                " - Enrollment Date: " + this.getEnrollmentDate() + 
                " - Passengers: " + this.getPassengers() + 
                " - Wheels: " + this.getWheels() + 
                " - Height: " + this.getHeight() +
                " - Type of Gas: " + this.getTypeOfGas() +
                " - Type of Cargo: " + this.getTypeOfCargo());
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    private void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the typeOfCargo
     */
    public String getTypeOfCargo() {
        return typeOfCargo;
    }

    /**
     * @param typeOfCargo the typeOfCargo to set
     */
    private void setTypeOfCargo(String typeOfCargo) {
        this.typeOfCargo = typeOfCargo;
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
