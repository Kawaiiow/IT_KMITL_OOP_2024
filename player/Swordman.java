/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package player;

/**
 *
 * @author LAB203_02
 */
public class Swordman extends Player{

    public Swordman(String name, double healthPoint, double energyPoint, double cash, String gender) {
        super(name, healthPoint, energyPoint, cash, gender);
    }

    public Swordman() {
        super();
    }
    
    public void fighting (Swordman s){
        if (this.getEnergyPoint() < 20){
            System.out.println(this.getName() + " is not enough the energy " + this.getEnergyPoint());
        }
        else if (this.getEnergyPoint() >= 20){
            s.setHealthPoint(s.getHealthPoint() - 50);
            this.setEnergyPoint(this.getEnergyPoint() - 20);
            System.out.println(this.getName()+"("+this.getHealthPoint()+","+this.getEnergyPoint()+") fights with "+s.getName()+"("+s.getHealthPoint()+","+s.getEnergyPoint()+").");
        }
    }
    
    public void fighting (Swordman s, int round){
        int i;
        
        i = 0;
        while (i < round && s.getHealthPoint() > 0) {            
            i++;
            System.out.print("Round " + i +":");
            this.fighting(s);
        }
        if (s.getHealthPoint() <= 0) {
            System.out.println(s.getName() + " is zero HP.");
        }
    }
    
    public Potion buy (Alchemist a, String potionName){
        Potion hand;
        
        hand = null;
        if (potionName.equals("Energy Point Medicine")){
            hand = a.sell(this, potionName);
        }
        else if (potionName.equals("Health Point Medicine")){
            hand = a.sell(this, potionName);
        }
        else if (potionName.equals("High Health Point Medicine")){
            hand = a.sell(this, potionName);
        }
        else{
            System.out.println("The " + potionName + " does not found in the list.");
        }
        return hand;
    }
}
