/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.manuel.ejercicio4;

/**
 *
 * @author Manuel
 */
public class Main {

    public static void main(String[] args) {
        Vehicle[] Vehicles = new Vehicle[10];
        System.out.println("Welcome, we are going to start adding Vehicles to the Array, lets begin.");
        for(int i=0; i<Vehicles.length; i++){
            System.out.println("We are creating your vehicle number: " + (i+1));
            Vehicles[i]=Vehicle.createVehicle();
        }
        for(int i=0; i<Vehicles.length; i++){
            System.out.println( i+1 + ". Enrollment Date: " + Vehicles[i].getEnrollmentDate() + 
                    " - Passengers: " + Vehicles[i].getPassengers() + 
                    " - Wheels: " + Vehicles[i].getWheels() + " - Color: " + Vehicles[i].getColor() + 
                    " - Mean of Travel: " + Vehicles[i].getMeanOfTravel() + 
                    " - Kilometers: " + Vehicles[i].getKilometers());  
        }
    }
}
