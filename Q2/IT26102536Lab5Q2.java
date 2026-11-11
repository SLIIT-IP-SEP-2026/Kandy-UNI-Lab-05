import java.util.Scanner;
public class IT26102536Lab5Q2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//get user inputs
		System.out.print("Enter the number of new members introduced: "); 
		int newMem = input.nextInt();
		
		if (newMem < 0) {
			System.out.println("Input must be a number 0 or greater");
		}
		
		else {
			
			//use switch cases
			switch (newMem) {
			
				case 0 : System.out.println("\nNo Prize");
				break;
			
				case 1 : System.out.println("\nPrize is : Pen");
				break;
			
				case 2 : System.out.println("\nPrize is : Umbrella");
				break;
			
				case 3 : System.out.println("\nPrize is : Bag");
				break;
			
				case 4 : System.out.println("\nPrize is : Travelling Chair");
				break;
			
				default : System.out.println("\nPrize is : Headphone");
			}
		}
	}
}