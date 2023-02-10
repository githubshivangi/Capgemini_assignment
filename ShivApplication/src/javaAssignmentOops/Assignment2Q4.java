package javaAssignmentOops;

abstract class Shape {
	  int sides;

	  Shape(int sides) {
	    this.sides = sides;
	  }

	  abstract double calculateArea();
	}

	class Triangle extends Shape {
	  Triangle(int sides) {
	    super(sides);
	  }

	  @Override
	  double calculateArea() {
	    return 0.5 * sides * sides;
	  }
	}

	public class Assignment2Q4 {
	  public static void main(String[] args) {
	    Shape triangle = new Triangle(5);
	    System.out.println("Area of Triangle: " + triangle.calculateArea());
	  }
	}

