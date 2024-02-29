package come.neotech.lesson07;

import java.util.Scanner;

public class PracticReal01 {

	public static void main(String[] args) {

		int day ;
		Scanner Scann = new Scanner(System.in);

		System.out.println("enter a number from 1 to 7 ");

		
		day = Scann.nextInt();

	   if (day >=1 && day<= 5) {
		   System.out.println("its a weekday !!!");
	   }
	    
	   else if (day  >= 6 &&  day <= 7) {
		   System.out.println("its a weekend ");
	   }
	
	   else {
		   System.out.println("its in valid day");
	  }
	   
		
 


	
	
	
	
	
	
	
	
	
	
	
	}

}
