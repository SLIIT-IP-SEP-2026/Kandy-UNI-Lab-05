import java.util.Scanner;

public class IT26102304Lab5Q1{
	public static void main(String[]args){
		
		int no1 , no2 , no3 , smallest , largest;
		
	Scanner input= new Scanner(System.in);

	System.out.println("Enter the first integer :");
	no1 = input.nextInt();
	
	System.out.println("Enter the second integer :");
	no2 = input.nextInt();
	
	System.out.println("Enter the third integer :");
	no3 = input.nextInt();
	
	smallest = no1;
	largest = no1;
	
	if (no2 < smallest){
		smallest = no2 ;
	}
	if (no3 < smallest){
		smallest=no3;
	}
	if (no2 > largest){
		largest = no2;	
	}
	if (no3 > largest){
		largest= no3 ;
	}
	
	System.out.println("User eneterd number are:" +no1+ " " +no2+ " " +no3 );
	
	System.out.println("The smallest number is :"+smallest);
	
	System.out.println("The largest number is :"+largest);
	}
	
}