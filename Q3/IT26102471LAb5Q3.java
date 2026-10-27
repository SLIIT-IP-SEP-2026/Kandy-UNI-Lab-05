import java.util.Scanner;

public class IT26102471Lab5Q3{
	public static void main(String [] args){
		
		final double Room_charge_per_day=48000.00;
		final double Discount_3_to_4_days=0.1;
		final double Discount_5_to_more_days=0.2;
		
		
		int Start_Date,End_Date,Number_of_days_reserved;
		double Total_amount_before_discount,Discount_Amount,Total_Amount_to_be_paid;
		
		double Discount_rate=0;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter Start Date(1-31):");
		 Start_Date=input.nextInt();
		 
		System.out.println("Enter End Date(1-31):");
		 End_Date=input.nextInt();
		
		
		if(Start_Date<1 || Start_Date>31|| End_Date<1||End_Date>31){
			System.out.println("Error Days Must Be Between 1 and 31");
			return;
		}
		
		if(Start_Date>End_Date){
			System.out.println("Error Start date must be less than End date");
            return;		
		}
	
		Number_of_days_reserved=End_Date-Start_Date;
		
		if(Number_of_days_reserved>=3&&Number_of_days_reserved<=4){
			
			Discount_rate=Discount_3_to_4_days;
		}else if(Number_of_days_reserved>=5){
			
			Discount_rate=Discount_5_to_more_days;
		}
		
		Total_amount_before_discount=Number_of_days_reserved*Room_charge_per_day;
		Discount_Amount=Total_amount_before_discount*Discount_rate;
		Total_Amount_to_be_paid=Total_amount_before_discount-Discount_Amount;
		
		System.out.println("Room charger per day:"+Room_charge_per_day);
		System.out.println("Number of days reserved:"+Number_of_days_reserved);
		System.out.println("Total amount to be paid:"+Total_Amount_to_be_paid);
		
		
	}
}	
		





		
		