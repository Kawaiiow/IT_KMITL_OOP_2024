package Programmer;

public class Employee
{
	private static String	nationality = "Thai";	
	private	String			name;
	private	Wallet			wallet;
	private	int				energy;

	public boolean	buyFood(Seller s)
	{
		Food	on_hand;

		on_hand = s.sell(this);
		if (on_hand != null)
		{
			this.eat(on_hand);
			return (true);
		}
		return (false);
	}

	public void	eat(Food f)
	{
		this.setEnergy(this.energy + Food.getEnergy());
	}

	// setter

	public void	setName(String name)
	{
		this.name = name;
	}

	public void setWallet(Wallet wallet)
	{
		this.wallet = wallet;
	}

	public void	setEnergy(int energy)
	{
		this.energy = energy;
	}

	public static void setNationality(String nationality)
	{
		Employee.nationality = nationality;
	}

	// getter

	public String	getName()
	{
		return (this.name);
	}

	public Wallet	getWallet()
	{
		return (this.wallet);
	}

	public int	getEnergy()
	{
		return (this.energy);
	}

	public static String	getNationality()
	{
		return (Employee.nationality);
	}

	// overriden

	public boolean	equals(Employee e)
	{
		return (e.name == this.name ? true : false);
	}

	public String	toString()
	{
		String	fmt = "My name is %s. \n" + //
						"I have %d energy left.\n" + //
						"I have a balance of " + this.wallet.getBalance() + " baht.";
		return (String.format(fmt ,this.name, this.energy));
	}
}
