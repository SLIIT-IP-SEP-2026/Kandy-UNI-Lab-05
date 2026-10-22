import java.util.Scanner;

public class IT26102050Lab5Q1 {
	
	public static void main(String[] args) {
		
		int num1, num2, num3, smallest, largest;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first intrger : ");
		num1 = input.nextInt();
		
		System.out.println("Enter the second intrger : ");
		num2 = input.nextInt();
		
		System.out.println("Enter the third intrger : ");
		num3 = input.nextInt();
		
		smallest = num1;
		largest = num1;
		
		if (num2 < smallest)
		    smallest = num2;
		
		if (num3 < smallest)
			smallest = num3;
		
		if (num2 > largest)
			largest = num2;
		
		if (num3 > largest)
			largest = num3;
		
		System.out.println("User enterd numbers are : " +num1 + " " +num2 + " " +num3 );
		System.out.println("The Smallest Numberis : " +smallest);
		System.out.println("The Largest Numberis : " +largest);
		
	}
}	