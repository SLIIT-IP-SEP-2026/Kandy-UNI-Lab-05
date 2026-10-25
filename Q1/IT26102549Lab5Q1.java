import java.util.Scanner;

public class IT26102549Lab5Q1{
	
	public static void main(String[]args){
		
		int num1,num2,num3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first integer:");
		num1=sc.nextInt();
		
		System.out.println("Enter the second integer:");
		num2=sc.nextInt();
		
		System.out.println("Enter the third integer:");
		num3=sc.nextInt();
		
		System.out.println("User entered numbers are:"+num1+" "+num2+" "+num3);
		
		int smallest = num1;
		int largest = num3;
		
		if (num2<smallest){
			smallest=num2;
		}
		if (num3<smallest){
			smallest=num3;
		}
		if (num1>largest){
			largest=num1;
		}
		if (num2>largest){
			largest=num2;
		}
		
		System.out.println("The smallest number is:"+smallest);
		System.out.println("The largest number is:"+largest);
		
		sc.close();
		
	}
	
}