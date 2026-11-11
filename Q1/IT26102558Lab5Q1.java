import java.util.Scanner;

public class  IT26102558Lab5Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstInteger, secondInteger, thirdInteger;

        System.out.println("Enter the firstInteger: ");
         firstInteger = sc.nextInt();
		
		System.out.println("Enter the secondInteger: ");
         secondInteger = sc.nextInt();
		
		System.out.println("Enter the thirdInteger:");
         thirdInteger = sc.nextInt();

        int smallest = firstInteger;
		int largest = firstInteger;
		
		if(firstInteger < smallest){
			smallest=firstInteger;
		}
     
	    if(secondInteger < smallest){
			smallest=secondInteger;
		}
        
		if(thirdInteger < smallest){
			smallest=thirdInteger;
		}
		
		System.out.println("User enterd numbers are : "+ firstInteger+ "" +secondInteger + "" + thirdInteger + "");
		System.out.println("The smallest number is :" +smallest );
		System.out.println("THE largestnumber is: " + largest);
		
    }
}