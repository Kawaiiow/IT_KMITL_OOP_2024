/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer_Array;

/**
 *
 * @author kawaii
 */
public class Customer
{
    private String  firstName;
    private String  lastName;
    private Account acct[];
    private int     numOfAccount;
    // private CheckingAccount acct;

    public Customer(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = new Account[5];
        this.numOfAccount = 0;
    }

    public Customer()
    {
        this(null, null);
    }
    
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void addAccount(Account ac)
    {
        if (numOfAccount < 5)
            this.acct[numOfAccount++] = ac;
    }

    public String getFirstName()
    {
        return (this.firstName);
    }

    public String getLastName()
    {
        return (this.lastName);
    }

    public Account  getAccount(int index)
    {
        return (index >= 0 && index < 5 ? acct[index] : null);
    }

    public int  getNumOfAccount()
    {
        return numOfAccount;
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
            return ("The " + this.firstName + " has " + numOfAccount + " accounts.");
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

    public static void main(String[] args) {
        Customer cust = new Customer("Somsri", "Boonjing");
        Account acct1 = new Account(5000, "Somsri01");
        Account acct2 = new Account(3000, "Somsri02");
        cust.addAccount(acct1);
        cust.addAccount(acct2);
        cust.addAccount(acct2);
        cust.addAccount(acct2);
        cust.addAccount(acct2);
        cust.addAccount(acct2);
        cust.addAccount(acct2);
        cust.addAccount(acct2);
        cust.addAccount(acct2);
        // ทดลองฝากเงิน ถอนเงินในบัญชีต่างๆ
        cust.getAccount(0).withdraw(3000);
        cust.getAccount(1).deposit(3000);
        // แสดงข้อมูลของลูกค้า เช่น Somsri Boonjing has 2 accounts.
        System.out.println(cust);
        // ทดลองสร้างบัญชีและเพิEมบัญชีนัFนๆ ให้กับลูกค้า มากกว่า 5 บัญชี
        for (int i = 0; i < cust.getNumOfAccount(); i++) {
            cust.getAccount(i).showAccount();
        }
    }
}
