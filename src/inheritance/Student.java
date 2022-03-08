package inheritance;

public class Student extends Human { 
	int marks;
	
	
	Student(int age,int marks) {
		super(age);
		this.marks = marks;
	}

	void leran() {
		System.out.println("He is learing");
	}
	
	void eat() {
		System.out.println("Student is eating");
	}

}
