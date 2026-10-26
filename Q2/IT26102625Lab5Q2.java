import java.util.Scanner;

public class IT26102625Lab5Q2{
public static void main(String[]args){
	
Scanner input = new Scanner(System.in);

int a ;

System.out.println("Enter the number of new members introduced:");
a = input.nextInt();
	
	
	if(a<0)
	{
		System.out.println("Input must be a number 0 or greater");
	}
	else if(a==0)
	{
		System.out.println("No prize");
	}
	else if(a==1)
	{
		System.out.println("prize is a : pen");
	}
	else if(a==2)
	{
		System.out.println("prize is a : Umbrella");
	}
	else if(a==3)
	{
		System.out.println("prize is a : Bag");
	}
	else if(a==4)
	{
		System.out.println("prize is a : Travelling Chair");
	}
	else 
	{
		System.out.println("prize is a : Headphone");
	}
	


	
		
}
}