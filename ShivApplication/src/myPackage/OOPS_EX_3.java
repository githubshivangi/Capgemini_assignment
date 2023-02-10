/*package myPackage;

class Shape {
	String color;
	
}

class Triangle extends Shape {
	
}

public class OOPS_EX_3 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.color = "red";
	}
	
}  */


package myPackage;

class Shape {
	public void area() {
		System.out.println("display area");
	}
}

class Triangle extends Shape {
	public void area(int l, int h) {
		System.out.println(1/2*l*h);
	}
}


public class OOPS_EX_3 {
	public static void main(String[] args) {
		
	}

} 
