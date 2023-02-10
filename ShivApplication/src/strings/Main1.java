//COMPARE TWO STRINGS:

package strings;

public class Main1 {
	public static void main(String[] args) {
		String s1 = new String("Simplilearn");
		String s2 = new String("Practice");
		String s3 = new String("Study");
		String s4 = new String("Study");
		
		System.out.println("Comparing " + s1 + " and " + s2 + " :" +s1.equals(s2));
		
		System.out.println("Comparing " + s3 + " and " + s4 + " :" +s3.equals(s4));
		
		System.out.println("Comparing " + s1 + " and " + s4 + " :" +s1.equals(s4));
	}

}
