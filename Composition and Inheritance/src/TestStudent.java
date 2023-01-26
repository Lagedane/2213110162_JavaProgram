
public class TestStudent {

	public static void main(String[] args) {
		//Test Constructor and toString()
		Student jirapat = new Student("Jirapat Anantasirijinda", "1 Happy Ave");
		System.out.println(jirapat); //toString()

		//Test Setters and Getters
		jirapat.setAddress("25 Pattanakarn");
		System.out.println(jirapat); //toString()
		System.out.println(jirapat.getName());
		System.out.println(jirapat.getAddress());

		//Test addCourseGrade(), printGrades(), and getAverageGrade()
		jirapat.addCourseGrade("INT-107", 25);
		jirapat.addCourseGrade("INT-108", 79);
		jirapat.addCourseGrade("MSC-202", 69);
		jirapat.printGrades();

		System.out.printf("The average grade is %.2f%n", jirapat.getAverageGrade());

	}

}
