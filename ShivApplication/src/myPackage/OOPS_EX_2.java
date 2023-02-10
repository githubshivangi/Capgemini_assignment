//package myPackage;


// Example of non-parameterized Constructor:
/*class Student {	
	String name;
	int age;
	
	 public void getInfo() {
	       System.out.println("The name of this Student is " + this.name);
	       System.out.println("The age of this Student is " + this.age);	 	  

	 }
	 
	 //Create non-parameterized constructor
	 Student() {
		 System.out.println("constructor called");
	 
	 }
}


public class OOPS_EX_2 {		
	public static void main(String args[]) {
		 Student s1 = new Student();
	       s1.name = "Shivangi";
	       s1.age = 22;
	       
	       s1.getInfo();

    }

} */



//Example of Parameterized Constructor:
/*package myPackage;

class Student {	
	String name;
	int age;
	
	 public void getInfo() {
	       System.out.println("The name of this Student is " + this.name);
	       System.out.println("The age of this Student is " + this.age);	 	  

	 }
	 
	 //Create Parameterized constructor
	 Student(String name, int age) {
		 this.name = name;
		 this.age = age; 
	 
	 }
}

public class OOPS_EX_2 {		
	public static void main(String args[]) {
		 Student s1 = new Student("Shivangi", 22);
	       	       
	       s1.getInfo();

    }

} */




//Example of Polymorphism:
package myPackage;

class Student {	
	String name;
	int age;
	
	 public void getInfo(String name) {
		 System.out.println(name);
	 }
	 
	 public void getInfo(int age) {
		 System.out.println(age);
	 }
	 
	 public void getInfo(String name, int age) {
		 System.out.println(name + " " + age);
	 }
}	 

public class OOPS_EX_2 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Shivangi";
		s1.age = 22;
		
		s1.getInfo(s1.name, s1.age);
		
	}
} 
	 


	

	      