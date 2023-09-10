import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your 1st number ==>> ");
		int a = scan.nextInt();
		System.out.println("Enter your 2nd number ==>> ");
		int b = scan.nextInt();
		
		double dist = Math.sqrt(a*a + b*b);
		System.out.println("The distance from the origin is " + dist);
	}

}
