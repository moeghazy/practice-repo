package come.neotech.lesson09;

import java.util.Scanner;

public class HomeWorkloopWhileAndFor {

	public static  void main(String[] args) {

		/*
		 * * 1. Print 5 times this statement: "I love Neotech"
		 * 
		 * 2. Write a program that asks the user to enter his/her User Name and password
		 * until the user enters them correctly.
		 * 
		 * 3. Print numbers from 1 to 50 except those that are divisible by 3.
		 * 
		 * 4. Create a program that will be asking the user to apply for a credit card
		 * 10 times. As soon you get a "yes" from the user program should stop asking.
		 */

		// ----> First Task//

		for (int neotech = 0; neotech < 5; neotech++) {

			System.out.println(" I LOVE NEOTECH ");

		}

		System.out.println("****************");

		// ----->second task

		String userName = null ,password  ;
		Scanner intake = new Scanner(System.in);

		
		do {
			System.out.println("please enter User Name ");
			 userName = intake.nextLine();

			System.out.println("please  enter your password ");
			password = intake.nextLine();
		}

		while (!userName.equals("USA") && !password.equalsIgnoreCase(password));

		System.out.println("Login verified correct ");

		intake.close();

		// ----> third task
		System.out.println("************");
		for (int num = 1; num <= 50; num++) {
			if (num % 3 == 0)
				continue;

			System.out.println(num + " ");
		}

		System.out.println("\n");

		// task 4

		String input;
		for (int num = 1; num <= 10; num++) {
			System.out.println(" apply for a gold  credit card");
			input = intake.next();
			if (input.equals("Yes"))                        {

			}
			;
		}

	}

}
