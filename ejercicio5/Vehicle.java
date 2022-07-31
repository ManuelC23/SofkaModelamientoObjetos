package com.manuel.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class Vehicle {
    private int passengers;
    private boolean tripulation;
    private int wheels;
    private String enrollmentDate;
    private String meanOfTravel;
    private String color;
    private int kilometers;

    /*
    Constructor de la clase vehículos
    */
    public Vehicle(int passengers, boolean tripulation, String enrollmentDate, String meanOfTravel, String color, int kilometers, int wheels) {
        this.passengers = passengers;
        this.tripulation = tripulation;
        this.enrollmentDate = enrollmentDate;
        this.meanOfTravel = meanOfTravel;
        this.color = color;
        this.kilometers = kilometers;
        this.wheels = wheels; 
    }
    
    /*
    Método utilizado para la creación de un vehículo,
    el usuario debe introducir manualmente cada uno de los datos
    requeridos y posteriomrnete se utiliza el constructor para
    crear el vehículo.
    */
    
    public static Vehicle createVehicle(){
            
            System.out.println("How many Passengers are in the Vehicle? ");
            Scanner passengersInput = new Scanner(System.in);
            int passengers = passengersInput.nextInt();
            System.out.println("Does the vehicle has tripulation?\n1- Yes 2- No");
            Scanner tripulationInput = new Scanner(System.in);
            int tripulation = tripulationInput.nextInt();
            boolean tripulationBoolean = false;
            if(tripulation == 1){
                tripulationBoolean = true;
            }
            System.out.println("Please type your vehicle enrollment Date ");
            Scanner enrollmentInput = new Scanner(System.in);
            String enrollmentDate = enrollmentInput.nextLine();
            System.out.println("Please type your vehicle mean of travel: Road, Water, Air or Rails.");
            Scanner meanInput = new Scanner(System.in);
            String meanOfTravel = meanInput.nextLine();
            System.out.println("Please type your vehicle color: ");
            Scanner colorInput = new Scanner(System.in);
            String color = colorInput.nextLine();
            System.out.println("Please type the kilometers of your vehicle: ");
            Scanner kilometersInput = new Scanner(System.in);
            int kilometers = kilometersInput.nextInt();
            System.out.println("Please type the number of wheels of your vehicle: ");
            Scanner wheelsInput = new Scanner(System.in);
            int wheels = wheelsInput.nextInt();
            return new Vehicle(passengers,tripulationBoolean,enrollmentDate,meanOfTravel,color,kilometers,wheels);
    }
    
    public void printVehicle(){
        System.out.println("");
    }


    /**
     * @return the Passengers
     */
    public int getPassengers() {
        return passengers;
    }

    /**
     * @param Passengers the Passengers to set
     */
    private void setPassengers(int Passengers) {
        this.passengers = Passengers;
    }

    /**
     * @return the Tripulation
     */
    public boolean isTripulation() {
        return tripulation;
    }

    /**
     * @param Tripulation the Tripulation to set
     */
    private void setTripulation(boolean Tripulation) {
        this.tripulation = Tripulation;
    }

    /**
     * @return the Wheels
     */
    public int getWheels() {
        return wheels;
    }

    /**
     * @param Wheels the Wheels to set
     */
    private void setWheels(int Wheels) {
        this.wheels = Wheels;
    }

    /**
     * @return the enrollmentDate
     */
    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    /**
     * @param enrollmentDate the enrollmentDate to set
     */
    private void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    /**
     * @return the meanOfTravel
     */
    public String getMeanOfTravel() {
        return meanOfTravel;
    }

    /**
     * @param meanOfTravel the meanOfTravel to set
     */
    private void setMeanOfTravel(String meanOfTravel) {
        this.meanOfTravel = meanOfTravel;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    private void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the Kilometers
     */
    public int getKilometers() {
        return kilometers;
    }

    /**
     * @param Kilometers the Kilometers to set
     */
    private void setKilometers(int Kilometers) {
        this.kilometers = Kilometers;
    }
    
    
}