package Programmer;

public class SeniorProgrammer extends Programmer
{
	// @Override
	public void	coding(String str)
	{
		int	e;

		e = this.getEnergy();
		if (e >= 10)
			System.out.println("I'm coding about " + str);
		else
			System.out.println("ZzZzZz");
		this.setEnergy(e - 5);
		this.setHappiness(e - 5);
	}

	public void	coding(String str, int num)
	{
		for (int i = 0; i < num; i++)
			this.coding(str);
	}

	public void	compliment(Programmer p)
	{
		p.setHappiness(p.getHappiness() + 20);
		System.out.println(p.getName() + " in a good mood");
	}

	public void	blame(Programmer p)
	{
		p.setHappiness(p.getHappiness() - 20);
		System.out.println(p.getName() + " in a bad mood");
	}
}
