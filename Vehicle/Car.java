package Vehicle;

public class Car extends Vehicle
{
	private String	typeEngine;
	
	public String	getTypeEngine()
	{
		return (this.typeEngine);
	}

	public void	setCarInfo(int s, String t, String y)
	{
		if (s >= 0)
			this.setFuel(s);
		if (t != null)
			this.setTopSpeed(t);
		if (y != null)
			this.typeEngine = y;
	}

	public void	setTypeEngine(String t)
	{
		if (t != null)
			this.typeEngine = t;
	}

	public void	move()
	{
		int	cur_fuel;

		cur_fuel = this.getFuel();
		if (cur_fuel >= 50)
		{
			System.out.println("Move.");
			this.setFuel(cur_fuel - 50);	
		}
		else
			System.out.println("Please add fuel.");
	}

	public void	showCarInfo()
	{
		System.out.println("Car engine is " + this.typeEngine + ".");
		this.showInfo();
	}
}
