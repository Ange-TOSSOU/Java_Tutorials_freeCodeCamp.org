package tutorial;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What's your name (without space please) ? ");
		String name = sc.next();
		System.out.println("Hi, " + name + "!");
		System.out.println();
		
		System.out.print("And, how old are you ? ");
		int age = sc.nextInt();
		System.out.println("You're " + age + "! Got it !");
		System.out.println();
		
		System.out.print("You like Fuze Tea; true or false ? ");
		boolean choice = sc.nextBoolean();
		System.out.println("You said " + choice + ". Okay !");
		System.out.println();
		
		System.out.print("What does 3/2 equal ? ");
		double answer = sc.nextDouble();
		System.out.println("Your answer is : " + answer + ". Okay !");
		System.out.println();
		
		System.out.print("Give me any whole number : ");
		String input = sc.next();
		int number = Integer.parseInt(input);
		System.out.println("Your number is : " + number + "! Thanks !");
	}

}
