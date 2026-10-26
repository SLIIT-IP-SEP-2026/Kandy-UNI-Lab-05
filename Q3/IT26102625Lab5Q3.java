import java.util.Scanner;
public class IT26102625Lab5Q3{
	public static void main(String[]args){
		
		int sd , ed , rd  ;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Start Date (1-31)");
		sd = input.nextInt();
		
		System.out.println("Enter End date (1-31)");
		ed = input.nextInt();
		
		rd = ed - sd ;
		double roomcharge = 48000.0 ;
		double dis3_4 = 0.1;
		double dis5 = 0.2 ;
		double ta;
		System.out.println("Room charge per day:" +roomcharge);
		System.out.println("Number of days reserved:" +rd);
		
		
		if(rd<0)
		{System.out.println("Error : Start Date must be less than End Date");
		return;}
		if(rd<3)
		{ ta = roomcharge * rd ;
	    System.out.println("Total amount to be paid:" +ta);return;}
		
	    if(rd<=4)
		{ ta =  roomcharge*rd -(roomcharge * dis3_4 * rd );
	    System.out.println("Total amount to be paid:" +ta);return;}
		if(rd>5)
		{ ta =  roomcharge*rd -(roomcharge * dis5 * rd );
	    System.out.println("Total amount to be paid:" +ta);return;}

	
		
		
		

		
		
		
		
	}
}