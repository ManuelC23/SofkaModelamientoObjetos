package com.manuel.ejercicio5;

import java.util.Scanner;

/**
 * Representación de un Bote con herencia de la clase Vehicle.
 * @author Manuel Cervantes
 */
public class Boat extends Vehicle{
    
    public String country; // Atributos de la clase Boat
    public String boatName;

    /*
    Constructor de la clase Boat
    */
    
    public Boat(String country, String boatName, int passengers, boolean tripulation, String enrollmentDate, String meanOfTravel, String color, int kilometers, int wheels) {
        super(passengers, tripulation, enrollmentDate, meanOfTravel, color, kilometers, wheels);
        this.country = country;
        this.boatName = boatName;
    }

    /*
    Método para crear un Boat
    */
    
    public static Vehicle createBoat(){
            System.out.println("Please type the name of your Boat: ");
            Scanner boatNameInput = new Scanner(System.in);
            String boatName = boatNameInput.nextLine();
            System.out.println("Please type the Country of your Boat: ");
            Scanner countryInput = new Scanner(System.in);
            String country = countryInput.nextLine();
            System.out.println("How many Passengers are in the Boat? ");
            Scanner passengersInput = new Scanner(System.in);
            int passengers = passengersInput.nextInt();
            System.out.println("Please type your Boat enrollment Date: ");
            Scanner enrollmentInput = new Scanner(System.in);
            String enrollmentDate = enrollmentInput.nextLine();
            System.out.println("Please type your Boat color: ");
            Scanner colorInput = new Scanner(System.in);
            String color = colorInput.nextLine();
            System.out.println("Please type the nautic miles of your Boat: ");
            Scanner milesInput = new Scanner(System.in);
            int miles = milesInput.nextInt();
            return new Boat(country,boatName,passengers,false,enrollmentDate,"Road",color,miles,0);
    }
   
    @Override
    public void printVehicle(){
        System.out.println("Type of Vehicle: Boat - Boat Name:  " + this.getBoatName() +
                " - Country: " + this.getCountry() +
                " - Color: " + this.getColor() + 
                " - Nautic Mileage: " + this.getKilometers() + 
                " - Enrollment Date: " + this.getEnrollmentDate() + 
                " - Passengers: " + this.getPassengers() + ".");
    }

    /**
     * @return the country
     */
    private String getCountry() {
        return country;
    }

    /**
     * @return the boatName
     */
    private String getBoatName() {
        return boatName;
    }
    
    
    
    
}
