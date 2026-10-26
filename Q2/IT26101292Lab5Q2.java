import java.util.Scanner;

public class IT26101292Lab5Q2{
	public static void main(String[] args){
		int mem;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the number of new members introduce:");
		mem=input.nextInt();
		
		if(mem==0){
			System.out.println("No prize");
			return;
		}
		else if(mem<0){
			System.out.println("Input must be a number 0 or greater");
			return;
		}
			

		else if(mem==1){
			System.out.println("Prize is a:Pen");
			return;
		}
		else if(mem<=2){
			System.out.println("Prize is a:Umbrella");
			return;
		}
		else if(mem<=3){
			System.out.println("Prize is a:Bag");
			return;
		}
		else if(mem<=4){
			System.out.println("Prize is a:Travelling chair");
			return;
		}
		else if(mem>=5){
			System.out.println("Prize is a:Headphone");
			return;
		}
		
			

		
		
		
		
		
		
		
	}
}
