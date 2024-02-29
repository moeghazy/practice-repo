package come.neotech.lesson07;

public class IntroSwitch {

	public static void main(String[] args) {

// give a number 1 to 7 , print the name of the day

		int day = -1;

		if (day == 1) {
			System.out.println("its monday");
		} else if (day == 2) {
			System.out.println("its a tuesday");
		}
		switch (day) {
    
         
		case 1:
		System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
		System.out.println("its wednesday");
		break;
		
		case 4:
		System.out.println("its tursday");
		break;
	   
		default :System.out.println("in valid day"); 
		break;
		
		
		
		
		}

	}

}
