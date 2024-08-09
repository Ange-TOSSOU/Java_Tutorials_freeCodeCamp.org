package tutorial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 6;
		int y = 23;
		int z = 10;
		
		System.out.println(x + " < " + y + " : " + (x < y));
		System.out.println(x + " <= " + y + " : " + (x <= y));
		System.out.println(x + " > " + y + " : " + (x > y));
		System.out.println(x + " >= " + y + " : " + (x >= y));
		System.out.println(x + " == " + y + " : " + (x == y));
		System.out.println(x + " != " + y + " : " + (x != y));
		
		System.out.println();
		
		System.out.println(x + " > " + y + " && " + z + " < " + y +" : " + (x > y && z < y));
		System.out.println(x + " > " + y + " || " + z + " < " + y +" : " + (x > y || z < y));
		System.out.println("!true : " + (!true));
		
		System.out.println();
		
		boolean compare = x < y && y > z || z + 2 < 5 || x + 7 > y;
		System.out.println(x + " < " + y + " && " + y + " > " + z + " || " + z + " + 2 < 5 || " + x + " + 7 > " + y + " : " + compare);
	}

}
