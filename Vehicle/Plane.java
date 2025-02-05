package Vehicle;

public class Plane extends Vehicle
{
	public void	setPlaneInfo(int s, String t)
	{
		if (s >= 0)
			this.setFuel(s);
		if (t != null)
			this.setTopSpeed(t);
	}

	public void	fly()
	{
		int	cur_fuel;

		cur_fuel = this.getFuel();
		if (cur_fuel >= 200)
		{
			System.out.println("Fly.");
			this.setFuel(cur_fuel - 200);	
		}
		else
			System.out.println("Please add fuel.");
	}

	public void	showPlaneInfo()
	{
		System.out.print("Plane detail is, ");
		this.showInfo();
	}
}
