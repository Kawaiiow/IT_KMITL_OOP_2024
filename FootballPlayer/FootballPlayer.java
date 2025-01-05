package FootballPlayer;

public class FootballPlayer extends Player{
	private int		playerNumber;
	private String	position;

	public int	getPlayerNumber()
	{
		return (this.playerNumber);
	}

	public String	getPosition()
	{
		return (this.position);
	}

	public void	setPlayerNumber(int n)
	{
		if (n > 0)
			this.playerNumber = n;
	}

	public void	setPosition(String p)
	{
		if (p != null)
			this.position = p;
	}

	public boolean	isSamePosition(FootballPlayer p)
	{
		return (this.position.equals(p.position) ? true : false);
	}
}
