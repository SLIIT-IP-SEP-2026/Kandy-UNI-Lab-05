import java.util.Scanner;

public class IT26101586LAB5Q3{
	
	public static void main(String[] args){
		
		final double RoomChargePerDay = 48000.0;
		final double Discount3_4Days = 0.10;
		final double Discountmore5 = 0.20;
		
		double discountrate = 0;
		
		double TotalAmount,TotalAmountBeforeTheDiscount,DiscountAmount;
		int StartDate,EndDate,DaysReserved;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter start date:");
		StartDate = input.nextInt();
		
		System.out.println("Enter end date:");
		EndDate = input.nextInt();
		
		if (StartDate < 1 || StartDate > 31 || EndDate < 1 || EndDate > 31) {
			
			System.out.println("Error: Days must be between 1 and 31");
			return;
		}
		
		if(StartDate  > EndDate) {
				System.out.println("Error: start date must be less than End date");
			
		}
		DaysReserved = EndDate - StartDate;
		
		if (DaysReserved >=3 && DaysReserved <=4){
			discountrate = Discount3_4Days;
		}
		else if (DaysReserved >= 5){
			discountrate = Discountmore5;
		}
		
		TotalAmountBeforeTheDiscount = DaysReserved * RoomChargePerDay;
		DiscountAmount = TotalAmountBeforeTheDiscount * discountrate;
		TotalAmount = TotalAmountBeforeTheDiscount - DiscountAmount;
		
		System.out.println("Room charge per day: " +RoomChargePerDay);
		System.out.println("Number of days Reserved:" +DaysReserved);
		System.out.println("Total amount to paid: " +TotalAmount);
		
	}
}