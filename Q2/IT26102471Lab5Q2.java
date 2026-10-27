import java.util.Scanner;

public class IT26102471Lab5Q2 {
    public static void main(String[] args) {

        int Number_of_new_members;
        String Prize;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of new members introduced: ");
        Number_of_new_members = input.nextInt();

        
        if (Number_of_new_members < 0) {
            System.out.println("Input must be a number 0 or greater");
            return;
        }

      
        switch (Number_of_new_members) {
            case 0:
                Prize = "No Prize";
                break;
            case 1:
                Prize = "Pen";
                break;
            case 2:
                Prize = "Umbrella";
                break;
            case 3:
                Prize = "Bag";
                break;
            case 4:
                Prize = "Travelling Chair";
                break;
            default:
                Prize = "Headphone";
                break;
        }

        if (Number_of_new_members == 0) {
            System.out.println(Prize);
        } else {
            System.out.println("Prize is a : " + Prize);
        }
    }
}