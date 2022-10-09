package com.cognizant.shapes;

import java.util.Scanner;

// shape class
public  class Shape {
	int numberOfSides=1;
	
	// method with two arguments
	  void calculateShapeArea(String shapeName,  int noOfSides){
		  this.numberOfSides = numberOfSides;
		}
	  
// circle class	
public class Circle {
		int Radius;
		public void calculateArea() {
			System.out.println("The Area of the Circle is : "+ 3.14*Radius*Radius);
		}
	}
// squar class
public class Squar {
	int Sides;
	public void calculateArea() {
		System.out.println("The Area of the Circle is : "+ Sides*Sides);
	}
}

// triangle class
public class Triangle {
	int Sides;
	public void calculateArea() {
		System.out.println("The Area of the Circle is : "+ 0.433*Sides*Sides);
	}
}

  //  main method
  public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	  Shape sh = new Shape();
	  // user input of number of sides
	  System.out.println("enter the number of sides of the shape");
	  sh.numberOfSides = sc.nextInt();
	  
      Circle ci = sh.new Circle();
	  Squar sq = sh.new Squar();
	  Triangle tr = sh.new Triangle();
	  
// condition part ->>>>>>>>
	  if(sh.numberOfSides==1) {
		  // user input of radius of circle
		  System.out.println("enter the radius of the circle");
		  ci.Radius = sc.nextInt();
		  // call the method of circle
		  ci.calculateArea();
	  }
	  else if(sh.numberOfSides==3) {
 // user input of the sides of triangle
		  System.out.println("enter the length of the side of the triangle");
		  tr.Sides = sc.nextInt();
		// call the method of triangle
		  tr.calculateArea();
	  }
	  else if(sh.numberOfSides==4) {
		  // user input of sides of squar
		  System.out.println("enter the length of the side of the squar");
		  sq.Sides = sc.nextInt();
		// call the method of squar
		  sq.calculateArea();
	  }
	  else {
		  System.out.println("No shapes present");
	  }
  }
}
