package inheritance;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor();
		instructor.firstName ="Engin";
		instructor.lastName =" DEMİROĞ";
		
		Student student = new Student();
		student.firstName= "Habibe";
		student.lastName = " BARAN";
		
		
		UserManager userManager = new UserManager();
		userManager.log();
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.login(instructor);
		
		StudentsManager studentsManager = new StudentsManager();
		studentsManager.login(student);
		
	}

}
