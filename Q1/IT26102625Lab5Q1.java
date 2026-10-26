import java.util.Scanner;
public class IT26102625Lab5Q1{
	public static void main(String[]args){
		
		int fi , si , ti ,sn , ln ;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the first integer:");
		fi = input.nextInt();
		
		System.out.println("Enter the second integer:");
		si = input.nextInt();
		
		System.out.println("Enter the third integer:");
		ti = input.nextInt();
		
		System.out.println("user entered numbers are :" +fi +" " +si+ " "+ti);
	
		sn = fi;
		ln = fi;
		
		if(si < sn)
		{ sn = si; }
		
		if(ti <sn)
		{ sn = ti; }
	
	    if(si > ln)
		{ ln = si;}
	
	    if(ti > ln)
		{ ln = ti;}
		
		System.out.println("The smallest number is :" +sn);
		System.out.println("The largest number is :" +ln);
		
		
		
		
	}
}