package secondweek;

public class svm1 {
	
	int id ;
	String name;
	static String company = "Multiicon";
	
	public svm1(int id , String name) {
		
		this.id = id ;
		this.name = name ;
		
		
	}
	
	void display() {
		System.out.println("id: " + id + "\n" + "name: " + name + "\n" + company);
		
	}
	
	public static void main(String[] args) {
		svm1 s1 = new svm1(100,"ABC");
		svm1 s2 = new svm1(200,"XYZ");
		
		s1.display();
		s2.display();
	}

}
