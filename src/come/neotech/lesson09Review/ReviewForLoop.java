package come.neotech.lesson09Review;

import java.util.Scanner;

public class ReviewForLoop {

	public static void main(String[] args) {
		
	
		String moe = "user",  pass = "password";
	              boolean yes = true;
		
	Scanner input = new Scanner (System.in);
	
	String user; String password;
	
	do {
		System.out.println("Enter the username and password");
	   user = input.next();
	   password= input.next();
	
	   if (user.equals(moe) && password.equals(pass)) {
		System.out.println("logged in successfully");
	
	break;
	}
	
	
	
	} while (yes);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
