import java.util.Scanner;
public class IT26102536Lab5Q3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//declare constant values
		final double ROOM_CHARGE_PD = 48000.0;
		
		//declare valiables
		int daysReserved, userEndDate, userStartDate;
		double discountRate, discountAmount, totAmount;
		
		
		//get user inputs
		System.out.print("Enter Start Date (1-31): ");
		userStartDate = input.nextInt();
		
		System.out.print("Enter End Date (1-31): ");
		userEndDate = input.nextInt();
		
		//reject invalid inputs
		if (userStartDate < 1 || userEndDate < 1 ||  userStartDate > 31 || userEndDate > 31) {
			System.out.println("Error: Days must be between 1 and 31");
			return;
		}
		
		if (userStartDate > userEndDate) {
			System.out.println("Error: Start Date must be less than End Date");
			return;
		}
		
			
		//process valid inputs
		else {
			System.out.println("\nRoom Charge Per day: Rs. " +ROOM_CHARGE_PD+ "/=");
			
			//calculations and display outputs
			daysReserved = userEndDate-userStartDate;
					
			System.out.println("Number of Days Reserved: " +daysReserved);
			
			if (daysReserved < 3) {
				discountRate = 0.0;
			}
			
			else if  (daysReserved == 3 || daysReserved == 4) {
				discountRate = 0.1;
			}
			
			else {
				discountRate = 0.2;
			}
			
			discountAmount = ROOM_CHARGE_PD * discountRate;
			
			totAmount =  (ROOM_CHARGE_PD - discountAmount) * daysReserved;
			
			System.out.println("Total Amount to be Paid: " +totAmount);
				
			
			
		}		
	
		
	}
}
	
		