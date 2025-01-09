package Programmer;

public class Programmer extends Employee
{
	private	int	happiness;

	public void coding(String str)
	{
		int	e;

		e = this.getEnergy();
		if (e >= 30)
			System.out.println("Your code is " + str);
		else
			System.out.println("Error Error Error");
		this.setEnergy(e - 30);
		this.happiness -= 30;
	}
	
	public void coding(char str)
	{
		this.coding(String.valueOf(str));
	}

	// setter

	public void	setHappiness(int happiness)
	{
		this.happiness = happiness;
	}

	// getter

	public int	getHappiness()
	{
		return (this.happiness);
	}
}
