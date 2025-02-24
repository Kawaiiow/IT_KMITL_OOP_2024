/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer_Array;

/**
 *
 * @author kawaii
 */
public class CheckingAccount extends Account
{
    private double credit;
    
    public CheckingAccount(double balance, String name, double credit)
    {
        super(balance, name);
        this.credit = credit;
    }

    public CheckingAccount()
    {
        this(0, "", 0);
    }
    
    
    public void setCredit(double credit)
    {
        if (credit > 0){
            this.credit = credit;
        }
        else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    
    public double getCredit()
    {
        return (this.credit);
    }
    
    @Override public void withdraw(double a)
    {
        if (a > 0 && this.balance - a >= 0) {
            this.balance -= a;
            System.out.println(a + " baht is withdrawn from " + this.name + " and your credit balance is " + this.credit + ".");
        }
        else if (a > 0 && (this.balance + this.credit) - a >= 0){
            this.credit -= Math.abs(this.balance - a);
            this.balance = 0;
            System.out.println(a + " baht is withdrawn from " + this.name + " and your credit balance is " + this.credit + ".");
        }
        else if (a <= 0){
            System.out.println("Input number must be a positive integer.");
        }
        else{
            System.out.println("Not enough money!");
        }
    }
    
    public void withdraw(String a)
    {
        this.withdraw(Float.parseFloat(a));
    }
    
    @Override public String toString()
    {
        return ("The " + this.name + " account has " + this.balance + " baht and " + this.credit + " credits.");
    }
}
