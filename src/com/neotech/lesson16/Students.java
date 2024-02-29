package com.neotech.lesson16;

public class Students {

	/*Create a Class called Students 
	▪ Create three variables studentName, studentID and numberOfStudents
	 (should be a static variable)
	▪ Create three objects of the Students Class
	▪ Set the value for studentName, studentID and increment
	the numberOfStudents for each object
	▪ Print out total the number of students
   */   
 String theStudentNameIs ,thestudentIdIs ;

 static int numberOfStudentsAre;

 void studentcv (){
	System.out.println(" the student Name Is : " + theStudentNameIs  );
	System.out.println(" And his ID Is " + thestudentIdIs + "\n" );		

 }
  public static void main(String[] args) {
	 
	 Students first  =  new Students ();
	 Students second =  new Students ();
	 Students third  =  new Students ();
 
 first.theStudentNameIs = "Mohamed";
 first.thestudentIdIs   = "[vip 22R ];";
 numberOfStudentsAre ++;
 
 
 second.thestudentIdIs   = "[vip 23R ];";
 second.theStudentNameIs ="Omar";
 numberOfStudentsAre ++;
 
 third.theStudentNameIs = "Fares";
 third.thestudentIdIs   = "[vip 24R ];";
 numberOfStudentsAre ++;
 
 first.studentcv();
 second.studentcv();
 third .studentcv();
 
 System.out.println("The Total Number Of Our School Is " + numberOfStudentsAre);
 
 
 
 
 
 
 
 }































}
