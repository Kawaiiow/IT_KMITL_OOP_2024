/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ability;

/**
 *
 * @author kawaii
 */
public class Ship extends Vehicle implements Floatable
{
    public Ship(double fuel)
    {
        super(fuel);
    }
    
    public Ship()
    {
        this(0);
    }
    
    @Override public void fl0at()
    {
        fuel = this.getFuel();
        
        if (fuel >= 50){
            this.setFuel(fuel - 50);
            System.out.println("Ship moves");
        }
        else{
            System.out.println("Fuel is not enough.");
        }
    }
    
    @Override public void startEngine()
    {
        fuel = this.getFuel();
        
        if (fuel >= 10){
            this.setFuel(fuel - 10);
            System.out.println("Engine starts");
        }
        else{
            System.out.println("Fuel is not enough.");
        }
    }
    
    @Override public void stopEngine()
    {
        System.out.println("Engine stops");
    }
    
    @Override public void honk()
    {
        System.out.println("Shhhhh");
    }
    
    public void move()
    {
        this.fl0at();
    }
    
    public void move(int distance)
    {
        fuel = this.getFuel();
        
        while (fuel >= 50 && --distance >= 0) {
            this.move();
        }
        if (distance > 0){
            System.out.println("Fuel is not enough.");
        }
    }
}
