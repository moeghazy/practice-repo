package come.neotech.lesson09Review;


public class SecondTask {

	public static void main(String[] args) {
		
// print numbers from 1 to 50 except those are divisible by 3
	
	int num = 1;
	 
    while(num <= 50) {
	
	
	if (num % 3 == 0) {
		 
	 }
	 else {
		 System.out.print(num + " ");
	 }	
	
	num++;
    }
	System.out.println();
	
	for(int m = 1 ; m <= 50 ; m++) {
		
		if (m % 3 == 0) 
		  continue;
	
		
	
		System.out.print(m + " ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
