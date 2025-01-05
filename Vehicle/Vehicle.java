package Vehicle;

public class Vehicle
{
	private int		fuel;
	private String	topSpeed;

	protected int	getFuel()
	{
		return (this.fuel);
	}

	protected String	getTopSpeed()
	{
		return (this.topSpeed);
	}

	protected void	setFuel(int i)
	{
		if (i >= 0)
			this.fuel = i;
	}

	protected void	setTopSpeed(String n)
	{
		if (n != null)
			this.topSpeed = n;
	}

	public void	showInfo()
	{
		System.out.println("Fuel is " + this.fuel + " litre and Top Speed is " + this.topSpeed + " m/s.");
	}
}
