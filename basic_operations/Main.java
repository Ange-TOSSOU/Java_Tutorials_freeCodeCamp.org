package tutorial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		int y = 7;
		int z = 57;
		int result1 = x + y + z;
		int result2 = x - y - z;
		int result3 = x * y * z;
		
		int result4 = z / y;
		double result5 = z / y;
		double result6 = (double) z / y;
		
		double result7 = Math.pow(2, 10);
		
		System.out.println(x + " + " + y + " + " + z + " = " + result1);
		System.out.println(x + " - " + y + " - " + z + " = " + result2);
		System.out.println(x + " * " + y + " * " + z + " = " + result3);
		
		System.out.println(z + " / " + y + " = " + result4);
		System.out.println(z + " / " + y + " = " + result5);
		System.out.println(z + " / " + y + " = " + result6);
		
		System.out.println(2 + " ** " + 10 + " = " + result7);
		
		System.out.println("56 % 5 = " + (56 % 5));
	}

}
