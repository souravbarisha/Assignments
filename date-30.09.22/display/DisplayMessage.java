package com.assignments;
//Fix the compilation error and invoke the method printMessage() of DisplayMessage class.
/* class DisplayMessage{
	  void printMessage(){
	   System.out.println((“Hello My Message”);
	}
	}  
	Save the file as “DisplayMessage.java”  .

	class  MyProgram
	  {
	    public static void main(String arg[]){
	      MyProgram program=new MyProgram();
	      program.printMessage();
	   }
	}
Save the file as “MyProgram.java”   and  compile it. */

public class DisplayMessage {
		  void printMessage(){
			  System.out.println("Hello My Message");  // error due to an extra (
		}
}

class  My_program
		  {
		    public static void main(String arg[]){
		    DisplayMessage program = new  DisplayMessage(); // error due to wrong class called to create the object
		      program.printMessage();
		    	 
		   }
		}

		
		


