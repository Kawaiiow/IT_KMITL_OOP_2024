/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ability;

/**
 *
 * @author kawaii
 */
public class Pigeon extends Bird{
    private static int numberOfPigeon;
    
    public Pigeon(double wingSize, double weight, double height)
    {
        super.setWingSize(wingSize);
        super.setWeight(weight);
        super.setHeight(height);
        numberOfPigeon++;
    }
    
    public Pigeon()
    {
        this(0, 0, 0);
    }
    
    public void eat(String food)
    {
        if (food.equals("worm")){
            this.eat(0.5);
        }
        else if (food.equals("seed")){
            this.eat(0.2);
        }
        else{
            System.out.println("Pigeon can eat only worm and seed.");
        }
    }
    
    @Override public void fly()
    {
        this.setWeight(this.getWeight() - 0.25);
        if (this.getWeight() >= 5){
            System.out.println("Fly Fly");
        }
        else{
            System.out.println("I'm hungry.");
        }
    }
    
    @Override public void takeOff()
    {
        this.setWeight(this.getWeight() - 0.5);
        if (this.getWeight() >= 5){
            System.out.println("Take Off");
        }
        else{
            System.out.println("I'm hungry.");
        }
    }
    
    @Override public void landing()
    {
        this.setWeight(this.getWeight() - 0.5);
        if (this.getWeight() >= 5){
            System.out.println("Landing");
        }
        else{
            System.out.println("I'm hungry.");
        }
    }
    
    @Override public String toString(){
        return ("Pigeon " + this.getWeight() + " kg and " + " " + this.getHeight() + " cm. There are " + numberOfPigeon + " pigeons.");
    }
}
