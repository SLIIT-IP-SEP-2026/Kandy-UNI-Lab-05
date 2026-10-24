import java.util.Scanner;

public class IT26101644Lab5Q3{
    public static void main(String[] args) {
		
		final double roomChargePerDay = 48000.00;
		final double discountRate3_4Days = 0.10 ;
		final double discountRate5_MoreDays = 0.20 ;
		
		int startDate , endDate, numberOfDays;
		double totalAmountBeforeDiscount , discountAmount , totalAmountToBePaid;
		
		double discountRate = 0;
		
        Scanner input = new Scanner(System.in);
        
		
     
        System.out.print("Enter Start Date (1-31): ");
        startDate = input.nextInt();
		
		System.out.print("Enter End Date (1-31): ");
        endDate = input.nextInt();
		
		
		if ( startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31){
			
			System.out.println("Error: Days must be between 1 and 31");
			return;
			
		}
		
		if (startDate > endDate){
			
			System.out.println("Error: Start Date must be less than End Date");
			return;
		}
		
		numberOfDays = endDate - startDate;
		
		if ( numberOfDays >= 3 && numberOfDays <= 4){
			discountRate = discountRate3_4Days;
		}
		
		else if (numberOfDays >= 5){
			discountRate = discountRate5_MoreDays;
		}

		totalAmountBeforeDiscount = numberOfDays * roomChargePerDay;
		discountAmount = totalAmountBeforeDiscount * discountRate;
		totalAmountToBePaid = totalAmountBeforeDiscount - discountAmount;
		
		System.out.println("Room charges per day: " + roomChargePerDay + "/=" );
		System.out.println("Number of days reserved: " + numberOfDays);
		System.out.println("Total amount to be paid: " + totalAmountToBePaid);

    }


}    