import java.util.Scanner;

public class IT26102304Lab5Q2 {
  public static void main(String[]args){
   
   int members;
   
   Scanner input = new Scanner(System.in);
   
   System.out.print("Enter the number of new members introduced:");
   members = input.nextInt();
   
   if (members < 0){
	   System.out.println ("Input must be a number 0 or greater");
   }else { 
      switch (members){
		 case 0 :
		    System.out.println ("No Prize");
			break;
		case 1 :
		    System.out.println ("Prize is a : Pen");
			break;
			
		case 2 :
            System.out.println ("Prize is a : Umbrella");	
		 	break;
			
		case 3 :
            System.out.println ("Prize is a : bag");	
		 	break;
			
		case 4 :
            System.out.println ("Prize is a :Travelling chair ");	
		 	break;
	
		default:
            System.out.println ("Prize is a : Headphone");	
		 	break;	
			
	  }
   }
 }
}