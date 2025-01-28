/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer_2;

/**
 *
 * @author kawaii
 */
public class Customer
{
    private String firstName;
    private String lastName;
    private CheckingAccount acct;

    public Customer(String firstName, String lastName, CheckingAccount acct)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = acct;
    }


    public Customer(String firstName, String lastName)
    {
        this(firstName, lastName, null);
    }

    public Customer()
    {
        this(null, null, null);
    }
    
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    public void setAcct(CheckingAccount acct)
    {
        this.acct = acct;
    }
    
    public String getFirstName()
    {
        return (this.firstName);
    }

    public String getLastName()
    {
        return (this.lastName);
    }
    
    public CheckingAccount getAcct()
    {
        return (this.acct);
    }
    
    @Override public String toString()
    {
        if (acct == null){
            if (this.firstName == null || this.lastName == null){
                return ("doesn’t have account.");
            }
            else{
                return (this.firstName + " " + this.lastName + " doesn’t have account.");
            }
        }
        else{
            return ("The " + this.firstName + " account has " + acct.getBalance() + " baht and " + acct.getCredit() + " credits.");
        }
    }
    
    public boolean equals(Customer c)
    {
        String firstName;
        String lastName;
        
        firstName = c.firstName;
        lastName = c.lastName;
        if (firstName == null || lastName == null || this.firstName == null || this.lastName == null) {
            return (false);
        }
        return (this.firstName.equals(firstName) && this.lastName.equals(lastName));
    }
}
