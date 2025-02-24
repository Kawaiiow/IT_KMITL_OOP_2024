/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package player;

/**
 *
 * @author LAB203_02
 */
public class Alchemist extends Player{
    private double experience;

    public Alchemist(String name, double healthPoint, double energyPoint, double cash, String gender) {
        super(name, healthPoint, energyPoint, cash, gender);
        this.experience = 0;
    }

    public Alchemist() {
        super();
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }
    
    public Potion craftPotion(String potionName){
        Potion res;
        
        res = null;
        if (potionName.equals("Energy Point Medicine")){
            if (this.getEnergyPoint() <= 100){
                System.out.println(this.getName()+" is not enough the energy point.");
            }
            else{
                this.setEnergyPoint(this.getEnergyPoint() - 100);
                this.experience += 8;
                res = new BluePotion();
                System.out.println(this.getName() + " has the energy point at " + this.getEnergyPoint() + " and the experience point at " + experience + ".");
            }
        }
        else if (potionName.equals("Health Point Medicine")){
            if (this.getEnergyPoint() <= 50){
                System.out.println(this.getName()+" is not enough the energy point.");
            }
            else{
                this.setEnergyPoint(this.getEnergyPoint() - 50);
                this.experience += 5;
                res = new RedPotion();
                System.out.println(this.getName() + " has the energy point at " + this.getEnergyPoint() + " and the experience point at " + experience + ".");
            }
        }
        else if (potionName.equals("High Health Point Medicine")){
            if (this.getEnergyPoint() <= 150){
                System.out.println(this.getName()+" is not enough the energy point.");
            }
            else{
                this.setEnergyPoint(this.getEnergyPoint() - 150);
                this.experience += 9;
                res = new HiPotion();
                System.out.println(this.getName() + " has the energy point at " + this.getEnergyPoint() + " and the experience point at " + experience + ".");
            }
        }
        else{
            System.out.println("Incorrect Potion Name.");
        }
        return res;
    }
    
    public Potion sell(Player p, String potionName){
        Potion res;
        double price;
        
        res = null;
        if (potionName.equals("Energy Point Medicine")){    
            price = new BluePotion().getPrice();
            if (p.getCash() < price){
                System.out.println(p.getName() + " is not enough money.");
            }
            else{
                p.setCash(p.getCash() - price);
                this.setCash(this.getCash() + price);
                res = this.craftPotion(potionName);
            }
        }
        else if (potionName.equals("Health Point Medicine")){
            price = new RedPotion().getPrice();
            if (p.getCash() < price){
                System.out.println(p.getName() + " is not enough money.");
            }
            else{
                p.setCash(p.getCash() - price);
                this.setCash(this.getCash() + price);
                res = this.craftPotion(potionName);
            }
        }
        else if (potionName.equals("High Health Point Medicine")){
            price = new HiPotion().getPrice();
            if (p.getCash() < price){
                System.out.println(p.getName() + " is not enough money.");
            }
            else{
                p.setCash(p.getCash() - price);
                this.setCash(this.getCash() + price);
                res = this.craftPotion(potionName);
            }
        }
        else{
            System.out.println("The potion name is incorrect.");
        }
        return res;
    }
}
