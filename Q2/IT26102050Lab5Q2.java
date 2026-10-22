import java.util.Scanner;

public class IT26102050Lab5Q2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of new members introduced: ");
        int members = input.nextInt();

        if (members < 0) 
            System.out.println("Input must be a number 0 or greater");
         else if (members == 0) 
            System.out.println("No Prize");
         else if (members == 1) 
            System.out.println("Prize is a : Pen");
         else if (members == 2) 
            System.out.println("Prize is a : Umbrella");
         else if (members == 3) 
            System.out.println("Prize is a : Bag");
         else if (members == 4) 
            System.out.println("Prize is a : Travelling Chair");
         else 
            System.out.println("Prize is a : Headphone");

    }
}