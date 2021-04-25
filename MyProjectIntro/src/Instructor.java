
public class Instructor {
	public Instructor() {
		System.out.println("Egitmen olarak eklendim");
	}
	
	public Instructor(int id, String name, String surname, String information) {
		this(); // this class also runs the one without parameters
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.information = information;
		
	}
	
	int id;
	String name;
	String surname;
	String information;
	
}
