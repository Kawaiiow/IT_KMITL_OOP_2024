package FootballPlayer;

public class Player
{
    private String  name;
    private String  team;

    public String getName()
    {
        return (this.name);
    }

    public String getTeam()
    {
        return (this.team);
    }

    public void setName(String n)
    {
        if (n != null)
            this.name = n;
    }

    public void setTeam(String t)
    {
        if (t != null)
            this.team = t;
    }

    public boolean isSameTeam(Player p)
    {
        return (this.team.equals(p.team) ? true : false);
    }
}
