
import java.util.Scanner;

public class IT26101644Lab5Q1 {

    public static void main(String[] args) {

        int num1, num2, num3, smallest, largest;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        num1 = input.nextInt();

        System.out.println("Enter number 2: ");
        num2 = input.nextInt();

        System.out.println("Enter number 3: ");
        num3 = input.nextInt();

        smallest = num1;
        largest = num1;

        if (num2 < smallest) {
            smallest = num2;
        }

        if (num3 < smallest) {
            smallest = num3;
        }

        if (num2 > largest) {
            largest = num2;
        }

        if (num3 > largest) {
            largest = num3;
        }

        System.out.println("User entered numbers are: "
                + num1 + " " + num2 + " " + num3);

        System.out.println("The Smallest number is: " + smallest);
        System.out.println("The Largest number is: " + largest);

        input.close();
    }
}
