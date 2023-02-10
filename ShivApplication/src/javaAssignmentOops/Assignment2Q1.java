package javaAssignmentOops;


class SingletonInheritanceCheck{
	
private static SingletonInheritanceCheck singleton = new SingletonInheritanceCheck( );

private SingletonInheritanceCheck() { }

public static SingletonInheritanceCheck getInstance( ) {

return singleton;

}

protected static void demo( ) {
System.out.println("Singleton class is call:");

}

}

public class Assignment2Q1 {
public static void main(String[] args) {
SingletonInheritanceCheck tmp = SingletonInheritanceCheck.getInstance( );

tmp.demo();

}

}
