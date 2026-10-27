import java.util.Scanner;

public class IT26102471Lab5Q1{
	public static void main(String [] args){
	int numberOne,numberTwo,numberThree,smallest,largest;  
	
	Scanner input=new Scanner(System.in);
	  
    System.out.println("Enter number one:");
	 numberOne=input.nextInt();
	
	System.out.println("Enter the number two:");
	 numberTwo=input.nextInt();
	
	System.out.println("Enter the number three:");
	 numberThree=input.nextInt();
	
	smallest=numberOne;
	largest=numberOne;
	
	if(numberTwo<numberOne){
	  
	  smallest=numberTwo;
	}
	
	
	if(numberThree<smallest){
	  
	  smallest=numberThree;
	}
	
	if(numberTwo>largest){

      largest=numberTwo;
    }
	
    if(numberThree>largest){
     
      largest=numberThree;
	
	}

    System.out.println("User entered numbers are: "+numberOne+" "+numberTwo+" "+numberThree);
    System.out.println("The smallest number is:"+smallest);
    System.out.println("The largest number is:"+largest);
	}
	
}	
	
	
	  
	  