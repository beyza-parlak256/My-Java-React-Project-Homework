
public class Course {
	
	public Course() {
		System.out.println();
	}
	public Course(int id, String name, String detail, String instructor) {
		this();
		this.id= id;
		this.name = name;
		this.detail = detail;
		this.instructor = instructor;
	}
	
	int id;
	String name;
	String detail;
	String instructor;
	
}
