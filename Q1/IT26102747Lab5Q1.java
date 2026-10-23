import java.util.Scanner;
public class IT26102747Lab5Q1 {
	public static void main(String[] args){
	
	  int numberone , numbertwo , numberThree , smallest , largest ;
	  
	  Scanner input = new Scanner(System.in);
	  
	  System.out.println("Enter number one : ");
	  numberone = input.nextInt();
	  
	  System.out.println("Enter number two : ");
	  numbertwo = input.nextInt();
	  
	  System.out.println("Enter number three : ");
	  numberThree = input.nextInt();
	  
	  smallest=numberone;
	  largest=numberone;
	  
	  if(numbertwo<smallest) {
	  
	   smallest=numbertwo;
	  
	  }  if(numberThree<smallest) {
	  
	   smallest=numberThree;
	  }
	  if(numbertwo>largest); {
	  
	   largest=numbertwo;
	  }
	   
	  if(numberThree>largest){
	    largest=numberThree;
	  }

    System.out.println("User enterd numbers are : "+numberone + " " + numbertwo + " "+numberThree );
    System.out.println("the smallest number is : "+smallest	);
	System.out.println("The largest number is : "+largest );
	
	  
	}
	}