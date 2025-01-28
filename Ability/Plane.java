/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ability;

/**
 *
 * @author kawaii
 */
public class Plane extends Vehicle implements Flyable
{
    private String airline;
    private String boeing;
    private static final int MAX_FLYER = 2;
    
    public Plane(double fuel, String airline, String boeing)
    {
        this.setFuel(fuel);
        this.airline = airline;
        this.boeing = boeing;
    }
    
    public Plane()
    {
        this(0, "", "");
    }
    
    public void setAirline(String airline)
    {
        this.airline = airline;
    }
    
    public void setBoeing(String boeing)
    {
        this.boeing = boeing;
    }
    
    public String getBoeing()
    {
        return (this.boeing);
    }

    public String getAirline()
    {
        return (this.airline);
    }
    
    @Override public void fly()
    {
        fuel = this.getFuel();
        
        if (fuel >= 20){
            this.setFuel(fuel - 20);
            System.out.println("Plane Fly");
        }
        else{
            System.out.println("Fuel is nearly empty.");
        }
    }
    
    @Override public void takeOff()
    {
        fuel = this.getFuel();
        
        if (fuel >= 10){
            this.setFuel(fuel - 10);
            System.out.println("Plane Already to Take Off");
        }
        else{
            System.out.println("Fuel is nearly empty.");
        }
    }
    
    @Override public void landing()
    {
        fuel = this.getFuel();
        
        if (fuel >= 10){
            this.setFuel(fuel - 10);
            System.out.println("Plane Already to Landing");
        }
        else{
            System.out.println("Fuel is nearly empty.");
        }
    }

    @Override public void startEngine()
    {
        fuel = this.getFuel();
        
        if (fuel >= 20){
            this.setFuel(fuel - 20);
            System.out.println("Plane’s Engine starts");
        }
        else{
            System.out.println("Fuel is not enough.");
        }
    }
    
    @Override public void stopEngine()
    {
        System.out.println("Plane’s Engine stops");
    }
    
    @Override public void honk()
    {
        System.out.println("Weeeeeee");
    }
}
