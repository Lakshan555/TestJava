package inheritance;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	//create student obejet
		Student std = new Student(20,30);
		std.eat();
		System.out.println(std.age);
		std.leran();
		System.out.println(std.marks);
		
	}

}
