import java.util.Scanner;

public class IT26101292lab5Q1{
	public static void main(String[] args){
		int no1,no2,no3,small,large;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the first integer:");
		no1=input.nextInt();
		
		System.out.println("Enter the second integer:");
		no2=input.nextInt();
		
		System.out.println("Enter the third integer:");
		no3=input.nextInt();
		
		
		
		small=no1;
		large=no1;
		
		if(no2<small){
			small=no2;
		}
		if(no3<small){
			small=no3;
		}
		if(no2>large){
			large=no2;
		}
		if(no3>large){
			large=no3;
		}
		
		System.out.println("User entered number are:" +no1 + " " + no2 + " " + no3 );
		System.out.println("The smallest number is :"+small);
		System.out.println("the largest number is :"+large);
		
		
		
		
	}
}



