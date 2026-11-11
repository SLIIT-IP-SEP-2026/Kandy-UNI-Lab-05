import java.util.Scanner;

public class IT26102536Lab5Q1 {
	public static void main(String[] args) {
		
		//Scanner object create
		Scanner input = new Scanner(System.in);
		
		//get user inputs
		System.out.print("Enter the first integer: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		int num2 = input.nextInt();
		
		System.out.print("Enter the third integer: ");
		int num3 = input.nextInt();
		
		//calculation and display outputs
		System.out.println("\nUser entered numbers are : " + num1 + " " + num2 + " " + num3 + " ");
		
		if (num1 == num2 || num2 == num3 || num1 == num3) {
			System.out.println("Error!... Some numbers are same. Can't get smallest or largest number");
		}
		
		else {
			int smallest = num1; //declare smallest and largest variables 
			int largest = num1;
		
			
			// find largest
			if (num2 < smallest) {
                smallest = num2;
            }
            if (num3 < smallest) {
                smallest = num3;
            }

            // find largest
            if (num2 > largest) {
                largest = num2;
            }
            if (num3 > largest) {
                largest = num3;
            }

          
            System.out.println("The Smallest number is: " + smallest);
            System.out.println("The Largest number is: " + largest);
			
		}
		
	}
}

			
		