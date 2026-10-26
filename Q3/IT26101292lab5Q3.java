import java.util.Scanner;

public class IT26101292lab5Q3{
	public static void main(String[] args){
		int sdate,edate,rday;
		double pday=48000.0;
		double total;
		double dis2=0.1,dis3=0.2;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter start date:");
		sdate=input.nextInt();
		
		System.out.println("Enter end date:");
		edate=input.nextInt();
		
		if(sdate>edate){
			System.out.println("Start date must be less than end date");
			return;
		}

		if(sdate<1||edate>31||edate<1||sdate>31){
			System.out.println("days must be between 1 and 31");
			return;
		}

		System.out.println("room charge per day :"+pday );
		
		
		rday=edate-sdate;
		System.out.println("number of days reserved:"+rday);
		
		if(rday<3){
			total=rday*pday;
				System.out.println("total amount to pay:"+total);
		}
		if(rday<=4){
			total=rday*pday-rday*pday*dis2;
				System.out.println("total amount to pay:"+total);
		}
		if(rday>=5){
			total=rday*pday-rday*pday*dis3;
				System.out.println("total amount to pay:"+total);
		}
			
		
		
		
		
		
		
		
		
	}
}
