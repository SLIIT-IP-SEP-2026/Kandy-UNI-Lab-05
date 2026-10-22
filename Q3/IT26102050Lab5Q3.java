import java.util.Scanner;

public class IT26102050Lab5Q3 {
    
    public static void main(String[] args) {
        
        final double ROOM_CHARGE_PER_DAY = 48000.00;
        final double DISCOUNT_3_TO_4_DAYS = 0.10; // 10%
        final double DISCOUNT_MORE_THAN_5_DAYS = 0.20; // 20%
        
        int startDate, endDate, reservedDays;
        double totalAmountBeforeDiscount, discountAmount, totalAmount;
        double discountRate = 0.0;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        endDate = input.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Days must be between 1 and 31");
            return; 
        }
    
        if (startDate >= endDate) {
            System.out.println("Start Date must be less than end date");
            return; 
        }

        reservedDays = endDate - startDate;
        
        if (reservedDays == 3 || reservedDays == 4) {
            discountRate = DISCOUNT_3_TO_4_DAYS;
        } else if (reservedDays >= 5) {
            discountRate = DISCOUNT_MORE_THAN_5_DAYS;
        } else {
            discountRate = 0.0;
        }

        totalAmountBeforeDiscount = ROOM_CHARGE_PER_DAY * reservedDays;
        discountAmount = totalAmountBeforeDiscount * discountRate;
        totalAmount = totalAmountBeforeDiscount - discountAmount;

        System.out.println("Room charge per day : " + ROOM_CHARGE_PER_DAY);
        System.out.println("Number of days reserved : " + reservedDays);
        System.out.println("Total amount to be paid : " + totalAmount);
        
    }
}