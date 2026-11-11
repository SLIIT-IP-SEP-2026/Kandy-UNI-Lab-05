import java.util.Scanner;

public class IT26102418Lab5Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        final double ROOM_CHARGE_PER_DAY = 48000.0;
        
        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();
        
        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();
        
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }
        
        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }
        
        int daysReserved = endDate - startDate;
        double discountRate = 0.0;
        
        if (daysReserved >= 3 && daysReserved <= 4) {
            discountRate = 10.0;
        } else if (daysReserved >= 5) {
            discountRate = 20.0;
        }
        
        double totalCharge = daysReserved * ROOM_CHARGE_PER_DAY;
        double discountAmount = totalCharge * (discountRate / 100.0);
        double finalAmount = totalCharge - discountAmount;
        
        System.out.println();
        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/-");
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Total Amount to be Paid: " + finalAmount);
    }
}