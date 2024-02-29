package com.neotech.lesson14;

public class Phone {


	/*Homework 1:
	    Create a Class "Phone". Create 3 Objects of it: iPhone,
	     Android, Nokia with specific  attributes and behaviors.
*/
   // THE ATTRIIBUTES OF THE CLASS OR [ CHARACTERISTIC ];

 String brand , model , color , battery_life ;
 int memory , pixel ;

 
 
 void brand () {
		
	    System.out.println(" -the brand is  " + brand );
	}
 
 
 void battery_life () 
 {
	System.out.println(" -The " + brand + "battery life is " + battery_life );
 }           
 
 void memory () 
 {
   System.out.println(" -The memory is " + memory  );
 }

 void color () 
 {
	System.out.println(" -The " + brand + " is " + color ); 
 }

 void pixel (){
	 
	System.out.println(" -the " + brand + "has a unique camera  " +  pixel);
	
}




















}
