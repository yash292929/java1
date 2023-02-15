package secondweek;

class Bank
{
	void bank()
	{
		System.out.println("banking");
	}
}
class Current extends Bank
{
	void current()
	{
		System.out.println("currents");
	}
}
class Save extends Bank
{
	void save()
	{
		System.out.println("saving");
	}
}

public class Hierarchical 
{
	public static void main(String[] args)
	{
		
		Current c =new Current();
		Save s =new Save();
		
		c.current();
		s.save();
		c.bank();
		
	}
}



