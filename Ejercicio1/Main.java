/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.manuel.modelamientoobjetos.Ejercicio1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class Main{
    
    public static void main(String[] args) {
        System.out.println("Hello, the Solar System has the following planets:");
        
        final BigInteger uranusDistance = new BigInteger("2870990000");
        final BigInteger neptuneDistance = new BigInteger("4504300000");
        
        ArrayList<Planet> Planets = new ArrayList<Planet>();
        Planets.add(new Planet(3.303e+23,5.42,4879,46001200,"1","Mercury"));
        Planets.add(new Planet(4.869e+24,5.25,12106,108200000,"2","Venus"));
        Planets.add(new Planet(5.976e+24,5.51,12756,146600000,"3","Earth"));
        Planets.add(new Planet(6.421e+23,3.94,6794,227940000,"4","Mars"));
        Planets.add(new Planet(1.9e+27,1.33,142984,778330000,"5","Jupiter"));
        Planets.add(new Planet(5.688e+26,0.69,120536,1429400000,"6","Saturn"));
        Planets.add(new Planet(8.686e+25,1.29,51118,uranusDistance,"7","Uranus"));
        Planets.add(new Planet(1.024e+26,1.64,49492,neptuneDistance,"8","Neptune"));

        for(int i=0; i<Planets.size(); i++) { // Bucle for utilizado para mostrar los planetas del sistema solar..
            System.out.println(
                    "ID: " + Planets.get(i).getId()
                    + " - Name: " +  Planets.get(i).getName() 
            ); 
        }
        System.out.println("To calculate the gravitational atraction between planets, you must type their names.");
        System.out.println("Type the name of the first planet:");
        Scanner firstPlanetInput = new Scanner(System.in);  // Input para conocer el primer planeta
        String planet1 = firstPlanetInput.nextLine();
        System.out.println("Type the name of the second planet:");
        Scanner secondPlanetInput = new Scanner(System.in);  // Input para conocer el segundo planeta
        String planet2 = secondPlanetInput.nextLine();

        Planet.calculateAtraction(Planets,planet1,planet2);
        
    }

 
}
