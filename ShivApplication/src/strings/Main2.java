//REVERSING A STRING PROGRAM:

package strings;

public class Main2 {
	
	public static void main(String[] args) {
		String input = "Shivangi";
		
		StringBuilder input1 = new StringBuilder();
		
		input1.append(input);
		input1 = input1.reverse();
		
		System.out.println("The reverse String is : "+input1);
		
	}

}
