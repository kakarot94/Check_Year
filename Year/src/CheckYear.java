import java.util.Scanner;


public class CheckYear {
	
	//Reader for data input
	public static Scanner in;
	
	public static void main(String[] args) {
		
			leapOrNot(In());
		
	}
		
	
	//Checking the input year if is leap or not
	
	public static void leapOrNot(int year) {		
		
		if(year%400==0) 
		{	
			System.out.println("Year "+year+". is leap.");
		} 
		else if(year%100==0)
		{
			System.out.println("Godina "+year+". is leap.");
		} 
		else if(year%4==0) 
		{
			System.out.println("Godina "+year+". is leap.");
		} 
		else
			System.out.println("Godina "+year+". is not leap.");
	}
	
	public static int In() {
		
		in = new Scanner(System.in);
	
		//Asking for the year until the correct value is inserted
		while (true) {				
			System.out.print("Enter the year : ");		
			String input = in.next();
		
			try {
				return Integer.parseInt(input);
			} catch(NumberFormatException e){	//handle wrong input
				System.out.println("Wrong input, enter the year in the following format :'2019'");
				continue;
			}
		}
	}
}
