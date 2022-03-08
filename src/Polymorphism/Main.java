package Polymorphism;

public class Main {

	public static void main(String[] args) {
		Student kasun = new Student();
//		Employee saman = new Employee();
		Politician rajapaksha = new Politician();
//		kasun.eat();
//		saman.eat();
//		rajapaksha.eat();
		
		Human dasun = new Student();
		dasun.eat();
		Human saman = new Employee();
		saman.eat();
		
	}

}
