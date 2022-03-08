package Abstraction;

public class Main {

	public static void main(String[] args) {
//		Human human = new Human();
//		
//		human.drink();
//		System.out.println(human.isMarried);
		
		Employee emp = new Employee();
		emp.work();
		emp.drink();
		System.out.println(emp.salary);
		System.out.println(emp.isMarried);
		emp.run();
		

	}

}
