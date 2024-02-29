package com.neotech.lesson15;

public class Task {

	void larger(int a, int b) {
		if (a > b) {
			System.out.println(a + " is larger " + b);
		} else if (b > a) {
			System.out.println(b + "is larger than" + a);

		} else {
			System.out.println("both numbers are equals");
		}

	}

	void evenOrodd(int num) {
		if (num % 2 == 0) {
			System.out.println(num + "is even");
		}

		else {
			System.out.println(num + " is odd ");
		}

	}

	void SayHello(String country) {
		switch (country) {
		case "usa":
			System.out.println("hello");
			break;

		case "mexico":

			System.out.println("hola");
			break;
		default:
			System.out.println(" i dont know your languge ");
		}

	}

}
