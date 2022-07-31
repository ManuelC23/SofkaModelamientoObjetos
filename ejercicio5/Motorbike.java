package com.manuel.ejercicio5;

import java.util.Scanner;

/**
 * Representación de una Motocicleta con herencia de la clase Vehicle.
 * @author Manuel Cervantes
 */
public class Motorbike extends Vehicle{
    
    private String typeOfMotorbike;

    public Motorbike(String typeOfMotorbike, int passengers, boolean tripulation, String enrollmentDate, String meanOfTravel, String color, int kilometers, int wheels) {
        super(passengers, tripulation, enrollmentDate, meanOfTravel, color, kilometers, wheels);
        this.typeOfMotorbike = typeOfMotorbike;
    }
    
    public static Vehicle createMotorbike(){
            String motorbikeType;
            System.out.println("Is your Motorbike electric? \n1- Yes 2- No");
            Scanner motorbikeTypeInput = new Scanner(System.in);
            int motorbikeTypeInt = motorbikeTypeInput.nextInt();
            if(motorbikeTypeInt == 1){
                motorbikeType = "Electric Motorbike";
            }else{
                motorbikeType = "Gas Motorbike";
            }
            System.out.println("How many Passengers are in the Motorbike? ");
            Scanner passengersInput = new Scanner(System.in);
            int passengers = passengersInput.nextInt();
            System.out.println("Please type your Motorbike enrollment Date: ");
            Scanner enrollmentInput = new Scanner(System.in);
            String enrollmentDate = enrollmentInput.nextLine();
            System.out.println("Please type your Motorbike color: ");
            Scanner colorInput = new Scanner(System.in);
            String color = colorInput.nextLine();
            System.out.println("Please type the kilometers of your Motorbike: ");
            Scanner kilometersInput = new Scanner(System.in);
            int kilometers = kilometersInput.nextInt();
            return new Motorbike(motorbikeType,passengers,false,enrollmentDate,"Road",color,kilometers,2);
    }
    
    @Override
    public void printVehicle(){
        System.out.println("Type of Vehicle: " + this.getTypeOfMotorbike() + 
                " - Color: " + this.getColor() + 
                " - Kilometers: " + this.getKilometers() + 
                " - Enrollment Date: " + this.getEnrollmentDate() + 
                " - Passengers: " + this.getPassengers() + ".");
    }

    /**
     * @return the typeOfMotorbike
     */
    public String getTypeOfMotorbike() {
        return typeOfMotorbike;
    }

    /**
     * @param typeOfMotorbike the typeOfMotorbike to set
     */
    private void setTypeOfMotorbike(String typeOfMotorbike) {
        this.typeOfMotorbike = typeOfMotorbike;
    }
    
}
