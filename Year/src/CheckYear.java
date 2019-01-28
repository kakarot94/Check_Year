import java.util.*;


public class CheckYear {
	public static Scanner in;
	public static int In() {
		int Year;
		while (true) {				//Asking for the year until the correct value is inserted
			System.out.print("Unesite godinu : ");		
			String input = in.next();
			try {
				return Year = Integer.parseInt(input);
			} catch(NumberFormatException e){			//handle wrong input
				System.out.println("Pogresan unos,/nUnesite godinu u obliku :'2019'");
				continue;
			}
		}
	}
	public static void main(String[] args) {
		int Year = In();			
		if(Year%400==0) {
			System.out.println("Godina "+Year+". je prestupna.");
		}else if(Year%100==0){
			System.out.println("Godina "+Year+". je prestupna.");
		}else if(Year%4==0) {
			System.out.println("Godina "+Year+". je prestupna.");
		}else
			System.out.println("Godina "+Year+". nije prestupna.");
	}
}
