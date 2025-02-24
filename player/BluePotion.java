/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package player;

/**
 *
 * @author LAB203_02
 */
public class BluePotion extends Potion{

    public BluePotion() {
        super("Energy Point Medicine");
    }

    @Override
    public String getInfo() {
        return ("The EP medicine price " + this.getPrice() + " baht.");
    }

    @Override
    public double getPrice() {
        return 300.0;
    }

    @Override
    public void eat(Player p) {
        p.setEnergyPoint(p.getEnergyPoint() + 100);
    }
}
