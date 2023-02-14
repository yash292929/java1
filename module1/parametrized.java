package secondweek;

public class parametrized {
	
	int id;
	String name;
	
	public parametrized(int id , String name) {
		
		this.id = id;
		this.name = name;
	}
	
	void display()
	{
		System.out.println(id+ " " + name);
	}
	
	public static void main(String[] args) {
		
		parametrized p1 = new parametrized(100,"abc");
		parametrized p2 = new parametrized(200,"xyz");
		
		p1.display();
		p2.display();
		
	}

}
