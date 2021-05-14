package javaInheritance;

public class Main {

	public static void main(String[] args) {
		
		User user = new User();
		user.id = 1;
		user.firstName = "Beyza";
		user.lastName = "Parlak";
		user.email = "beyza@gmail.com";
		
		UserManager userManager=new UserManager();
		userManager.addUser(user);
		userManager.deleteUser(user);
		userManager.updateUser(user);
		
		Instructor instructor= new Instructor();
		instructor.id = 1;
		instructor.firstName = "Engin";
		instructor.lastName = "Demiroğ";
		instructor.courseName = "Java - React";
		instructor.courseNumber = "1";
		instructor.email = "engin@gmail.com";
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(instructor);
		instructorManager.addInstructor(instructor);
		
		Student student = new Student();
		student.id = 1;
		student.firstName = "Beyza";
		student.lastName = "Parlak";
		student.email = "beyzaparlak@gmail.com";
		student.school = "ETÜ";
		student.course = "Java - React";
		
		StudentManager studentManager = new StudentManager();
		studentManager.addStudent(student);
		studentManager.updateStudent(student);
		

	}

}
