/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ability;

/**
 *
 * @author kawaii
 */
public abstract class Bird implements Flyable
{
    private double  wingSize;
    private double  weight;
    private double  height;
    
    public Bird(double wingSize, double weight, double height)
    {
        this.wingSize = wingSize;
        this.weight = weight;
        this.height = height;
    }
    
    public Bird()
    {
        this(0, 0, 0);
    }
    
    public void setWingSize(double wingSize)
    {
        this.wingSize = wingSize;
    }
    
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
    
    public void setHeight(double height)
    {
        this.height = height;
    }
    
    public double getWingSize()
    {
        return (this.wingSize);
    }
    
    public double getWeight()
    {
        return (this.weight);
    }
    
    public double getHeight()
    {
        return (this.height);
    }
    
    public void eat(double food)
    {
        if (food > 0){
            this.weight += food;
        }
        else{
            System.out.println("Input cannot be negative number.");
        }
    }
}
