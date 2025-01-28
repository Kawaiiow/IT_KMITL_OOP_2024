/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ability;

/**
 *
 * @author kawaii
 */
public abstract class Vehicle implements Dieselable
{
    protected double fuel;
    
    public Vehicle(double fuel)
    {
        this.fuel = fuel;
    }
    
    public Vehicle()
    {
        this(0);
    }
    
    public void setFuel(double fuel)
    {
        this.fuel = fuel;
    }
    
    public double getFuel()
    {
        return (this.fuel);
    }
    
    public void addFuel(double fuel)
    {
        if (fuel > 0){
            this.fuel += fuel;
        }
        else{
            System.out.println("Fuel is empty.");
        }
    }
    
    public abstract void honk();
}
