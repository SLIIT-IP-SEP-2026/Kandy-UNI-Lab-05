import java.util.Scanner;

public class IT26102549Lab5Q2{
	
	public static void main(String[]args){
		
		int newMembers;
		
		Scanner main = new Scanner (System.in);
		
		System.out.println("Enter the number of new members introduced:");
		newMembers = main.nextInt();
		
		if (newMembers<0){
			System.out.println("Input must be a number 0 or greater");
			return;
		}
		
		switch(newMembers){
			case 0:
				System.out.println("No prize");
				break;
			case 1:
				System.out.println("The prize is a : Pen");
				break;
			case 2:
				System.out.println("The prize is a : Umbrella");
				break;
			case 3:
				System.out.println("The prize is a : Bag");
				break;
			case 4:
				System.out.println("The prize is a : Travelling Chair");
				break;
			default:
				System.out.println("The prize is a : Headphone");
			
		}
		
		
			
		main.close();
	}
	

	
}