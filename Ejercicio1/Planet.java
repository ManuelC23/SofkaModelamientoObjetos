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
public class Planet{
    private double mass;
    private double density;
    private double diameter;
    private double distanceToSun;
    private BigInteger distanceToSun2;
    private String Id;
    private String name;

    public Planet(double mass, double density, double diameter, double distanceToSun, String Id, String name) {
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.distanceToSun = distanceToSun;
        this.Id = Id;
        this.name = name;
    }
    
    public Planet(double mass, double density, double diameter, BigInteger distanceToSun, String Id, String name) {
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.distanceToSun2 = distanceToSun;
        this.Id = Id;
        this.name = name;
    }
    
   public static void calculateAtraction(ArrayList<Planet> Planets, String name1, String name2){
        double distance1 = 0;
        double distance2 = 0;
        double mass1 = 0;
        double mass2 = 0;
        double gravitationalAtraction;
        for (Planet item: Planets){
            if(item.getName().equals(name1)){
                distance1 = item.getDistanceToSun();
                mass1 = item.getMass();
            } else if(item.getName().equals(name2)){
                distance2 = item.getDistanceToSun();
                mass2 = item.getMass();
            }
        }
        if(distance1>distance2){
            gravitationalAtraction = (6.67e-11*mass1*mass2)/(distance1-distance2);
        } else {
            gravitationalAtraction = (6.67e-11*mass1*mass2)/(distance2-distance1); 
        }
        System.out.println("The gravitational atraction between " + name1 + " and " + name2 + " is: " + gravitationalAtraction + " Nm2/Kg2.");
        
    }


    /**
     * @return the mass
     */
    public double getMass() {
        return mass;
    }

    /**
     * @param mass the mass to set
     */
    private void setMass(double mass) {
        this.mass = mass;
    }

    /**
     * @return the density
     */
    private double getDensity() {
        return density;
    }

    /**
     * @param density the density to set
     */
    private void setDensity(double density) {
        this.density = density;
    }

    /**
     * @return the diameter
     */
    private double getDiameter() {
        return diameter;
    }

    /**
     * @param diameter the diameter to set
     */
    private void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    /**
     * @return the distanceToSun
     */
    public double getDistanceToSun() {
        return distanceToSun;
    }

    /**
     * @param distanceToSun the distanceToSun to set
     */
    private void setDistanceToSun(double distanceToSun) {
        this.distanceToSun = distanceToSun;
    }

    /**
     * @return the distanceToSun2
     */
    public BigInteger getDistanceToSun2() {
        return distanceToSun2;
    }

    /**
     * @param distanceToSun2 the distanceToSun2 to set
     */
    private void setDistanceToSun2(BigInteger distanceToSun2) {
        this.distanceToSun2 = distanceToSun2;
    }

    /**
     * @return the Id
     */
    public String getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    private void setId(String Id) {
        this.Id = Id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    private void setName(String name) {
        this.name = name;
    }

   
    
}
