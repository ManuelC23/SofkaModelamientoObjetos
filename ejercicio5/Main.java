package com.manuel.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class Main {

    public static void main(String[] args) {
        
        System.out.println("Welcome! \n¿How many Vehicles do you want to create?");
        Scanner vehiclesInput = new Scanner(System.in); // Scanner to let the user input how many vehicles want to create.
        int vehicles = vehiclesInput.nextInt();
        Vehicle[] Vehicles = new Vehicle[vehicles]; // Array created to store the vehicles the user want to create.
        for(int i=0; i<Vehicles.length; i++){
            System.out.println("We are creating your vehicle number: " + (i+1));
            System.out.println("What kind of Vehicle do you want to create? \n1- Car 2- Bicycle 3- Truck 4- Motorbike 5- Boat");
            Scanner vehicleSelect = new Scanner(System.in); // Scanner to let the user input how many vehicles want to create.
            int vehicleSelection = vehicleSelect.nextInt();
            if(vehicleSelection == 1){
                Vehicles[i]=Car.createCar();
            }else if(vehicleSelection == 2){
                Vehicles[i]=Bicycle.createBicycle();
            }else if(vehicleSelection == 3){
                Vehicles[i]=Truck.createTruck();
            }else if(vehicleSelection == 4){
                Vehicles[i]=Motorbike.createMotorbike();
            }else if(vehicleSelection == 5){
                Vehicles[i]=Boat.createBoat();
            }else{
                System.out.println("You pressed a wrong option. Please try again.");
            }
        }
        
        for(int i=0; i<Vehicles.length; i++){ // Bucle para imprimir los vehículos creados
            System.out.print("You created the following vehicles:\nID: " + (i+1 + " - "));
            Vehicles[i].printVehicle();
            
        }
    }
    
}
