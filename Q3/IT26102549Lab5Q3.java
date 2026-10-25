import java.util.Scanner;

public class IT26102549Lab5Q3{
	
	public static void main(String[]args){
		
		int startDate,endDate,days;
		double roomCharge=48000.00,totalAmount;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Start Date (1-31):");
		startDate = sc.nextInt();
		
		if (startDate<1||startDate>31){
			System.out.println("Days must be between 1 and 31");
			return;
		}
		
		System.out.println("Enter End Date (1-31):");
		endDate = sc.nextInt();
		
		if (endDate<1||endDate>31){
			System.out.println("Error: Days must be between 1 and 31");
			return;
		}
		
		if (endDate<startDate){
			System.out.println("Error: Start Date must be less than End Date");
			return;
		}
		
		System.out.println("Room Charge Per Day: "+roomCharge);
		
		days = endDate-startDate;
		System.out.println("Number of Days Reserved: "+days);
		
		if (days<3){
			totalAmount=roomCharge*days;
		}
		
		else if (days>=3||days<=4){
			totalAmount=roomCharge*days*0.9;
		}
		else{
			totalAmount=roomCharge*days*0.8;
		}
		
		System.out.println("Total Amount to be Paid: "+totalAmount);
		
		sc.close();
		
	}
	
	
}