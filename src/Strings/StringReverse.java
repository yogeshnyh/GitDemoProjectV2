package Strings;

public class StringReverse {

	public static void main(String[] args) {

		String s1 = "Java";
		String s2 = "Yogesh";
		
		StringBuffer sbf = new StringBuffer(s1);
		sbf.reverse();
		System.out.println("Reversed String  : "+sbf);
		
		System.out.print("Reversed String using iterative method: ");
		char charArray[] = s2.toCharArray();
		for(int i=s2.length()-1;i>=0;i--) {
			System.out.print(charArray[i]);
		}
	}

}
