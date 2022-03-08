package Encapsulation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner get = new Scanner(System.in);
		Human human = new Human();
		
//		String fisrtName;
//		System.out.println("Enter Your First Name:");
//		fisrtName = get.next();
		
		
		System.out.println("Enter Your Name:");
		human.setName(get.next());
		
		System.out.println("Enter Your age:");
		human.setAge(get.nextInt());
		
	
		
		
		
		System.out.println( "Your Name is " + human.getName());
		System.out.println("Your Age is " + human.getAge());
//		System.out.println(human.getAge());
//		
//		human.setName("pramidu");
//		human.setAge(30);
//		
//		System.out.println(human.getName());
//		System.out.println(human.getAge());
		
	}

}
