package com.manuel.ejercicio5;

import java.util.Scanner;

/**
 * Representación de una Bicicleta con herencia de la clase Vehicle.
 * @author Manuel Cervantes
 */
public class Bicycle extends Vehicle {
    
    private String typeOfBike; // Atributo único de la clase Bicicletas

    /*
    Constructor de la clase Bicycle
    */
    
    public Bicycle(String typeOfBike, int passengers, boolean tripulation, String enrollmentDate, String meanOfTravel, String color, int kilometers, int wheels) {
        super(1, false, "Not required", "Land", color, kilometers, 2);
        this.typeOfBike = typeOfBike;
    }
    
    /*
    Método para crear Bicicletas
    */
    
    public static Vehicle createBicycle(){
            String tipeBicycle;    
            System.out.println("Please select the type of your bicycle: \n1- Mountain Bicycle 2- Urban Bicycle ");
            Scanner typeOfBicycleInput = new Scanner(System.in);
            int typeOfBInt = typeOfBicycleInput.nextInt();
            if(typeOfBInt == 1){
                tipeBicycle = "Mountain Bicycle";
            } else {
                tipeBicycle = "Urban Bicycle";
            }
            System.out.println("Please type your bicycle enrollment Date: ");
            Scanner enrollmentInput = new Scanner(System.in);
            String enrollmentDate = enrollmentInput.nextLine();
            System.out.println("Please type your bicycle color: ");
            Scanner colorInput = new Scanner(System.in);
            String color = colorInput.nextLine();
            System.out.println("Please type the kilometers of your bicycle: ");
            Scanner kilometersInput = new Scanner(System.in);
            int kilometers = kilometersInput.nextInt();
            return new Bicycle(tipeBicycle,1,false,enrollmentDate,"Road",color,kilometers,2);
    }
    
    @Override
    public void printVehicle(){
        System.out.println("Type of Vehicle: " + this.getTypeOfBike() + 
                "  - Color: " + this.getColor() + 
                " - Kilometers: " + this.getKilometers() + 
                " - Enrollment Date: " + this.getEnrollmentDate() + 
                " - Passengers: " + this.getPassengers() + ".");
    }

    /**
     * @return the typeOfBike
     */
    public String getTypeOfBike() {
        return typeOfBike;
    }

    /**
     * @param typeOfBike the typeOfBike to set
     */
    private void setTypeOfBike(String typeOfBike) {
        this.typeOfBike = typeOfBike;
    }
    
    
    

   
    
    
    
    
}
