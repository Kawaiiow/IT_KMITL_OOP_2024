/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package player;

/**
 *
 * @author LAB203_02
 */
public abstract class Player {
    private String name;
    private double healthPoint;
    private double energyPoint;
    private double cash;
    private char gender;
    private static int playerCount;
    private final String playerId;
    protected static final int MAX_PLAYERS = 5;

    public Player(String name, double healthPoint, double energyPoint, double cash, String gender) {
        this.name = name;
        this.setHealthPoint(healthPoint);
        this.setEnergyPoint(energyPoint);
        this.setCash(cash);
        this.setGender(gender);
        playerCount++;
        this.playerId = name + "-" + playerCount;
    }

    public Player(String name, String gender){
        this(name, 10.0, 10.0, 100.0, gender);
    }
    
    public Player() {
        this("unknown", 10.0, 10.0, 100.0, "male");
    }

    public double getCash() {
        return cash;
    }

    public double getEnergyPoint() {
        return energyPoint;
    }

    public String getGender() {
        return (gender == 'f' ? "female" : "male");
    }

    public double getHealthPoint() {
        return healthPoint;
    }

    public static int getMAX_PLAYERS() {
        return MAX_PLAYERS;
    }

    public String getName() {
        return name;
    }

    public static int getPlayerCount() {
        return playerCount;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setCash(double cash) {
        if (cash < 0){
            System.out.println("Incorrect Input Cash.");
            return ;
        }
        this.cash = cash;
    }

    public void setEnergyPoint(double energyPoint) {
        if (energyPoint < 0){
            System.out.println("Incorrect Input Energy Point.");
            return ;
        }
        this.energyPoint = energyPoint;
    }

    public void setGender(String gender) {
        if (gender.equals("Female") || gender.equals("female")){
            this.gender = 'f';
        }
        else if (gender.equals("Male") || gender.equals("male")){
            this.gender = 'm';
        }
        else{
            System.out.println("Incorrect Input Gender.");
        }
    }

    public void setHealthPoint(double healthPoint) {
        if (healthPoint < 0){
            System.out.println("Incorrect Input Health Point.");
            return ;
        }
        this.healthPoint = healthPoint;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void drink (Eatable e){
        if (e instanceof BluePotion){
            ((BluePotion)e).eat(this);
            System.out.println(name + " has the energy point medicine at " + energyPoint+".");
        }
        else if (e instanceof HiPotion){
            ((HiPotion)e).eat(this);
            System.out.println(name + " has the high health point medicine at " + healthPoint+".");
        }
        else if (e instanceof RedPotion){
            ((RedPotion)e).eat(this);
            System.out.println(name + " has the health point medicine at " + healthPoint+".");
        }
    }

    @Override
    public boolean equals(Object obj) {
        return (this.playerId.equals(((Player)obj).getPlayerId()));
    }
    
    public boolean equals(Player obj) {
        return (this.playerId.equals(obj.getPlayerId()));
    }

    @Override
    public String toString() {
        return ("name="+name+", healthPoint="+healthPoint+", energyPoint="+energyPoint+", cash="+cash+", playerCount="+playerCount+", MAX_PLAYERS="+MAX_PLAYERS+", gender="+this.getGender()+", playerId="+playerId+".");
    }
}
