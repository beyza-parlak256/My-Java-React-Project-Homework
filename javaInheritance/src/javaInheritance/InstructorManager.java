package javaInheritance;

public class InstructorManager {

	public void addInstructor(Instructor instructor) {
		System.out.println(instructor.firstName + " " + instructor.lastName + " isimli eðitmen eklendi");
	}
	
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.firstName + " isimli eðitmen" + instructor.courseName + " kursu ekledi");
	}
}
