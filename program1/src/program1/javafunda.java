package program1;
import java.util.Scanner;

public class javafunda {
	
	public static void main(String args[]) {
		int firstvalue;
		int secondvalue;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter firstvalue:");
		firstvalue = scanner.nextInt();
		System.out.println("Enter secondvalue:");
		secondvalue = scanner.nextInt();
		
		int sum = firstvalue + secondvalue;
		
		System.out.println("The sum of the two numbers: " + sum);
	}
	

}
