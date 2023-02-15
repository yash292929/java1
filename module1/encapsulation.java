package secondweek;

public class encapsulation {
	
	public static void main(String[] args) {
		
		gettersetter gs = new gettersetter();
		gs.setId(101);
		gs.setName("ABC");
		
		System.out.println(gs.getId()+" "+gs.getName());
	}

}
