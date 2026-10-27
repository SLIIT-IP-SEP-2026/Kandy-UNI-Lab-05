import java.util.Scanner;

public class IT26101586LAB5Q1{
	
	public static void main(String[] args){
		
		int num1,num2,num3,smallest,largest;

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first integer:");
		num1 = input.nextInt();
		
		System.out.println("Enter the first integer:");
		num2 = input.nextInt();
		
		System.out.println("Enter the first integer:");
		num3 = input.nextInt();
	
		smallest = num1;
		largest = num1;
		
		if (num2 < smallest){
			smallest = num2;
		}
		
		if (num3 < smallest){
			smallest = num3;
		}
		
		if (num2 > largest){
			largest = num2;
			
		}
		
		if (num3 > largest){
			largest = num3;
		}
		
		System.out.println("user entered numbers are :"+num1+" "+num2+" "+num3);
		
		System.out.println("The Smallest number is:" +smallest);
		
		System.out.println("The Largest number is:" +largest);
		
	input.close();
		
		

		
	}


}
