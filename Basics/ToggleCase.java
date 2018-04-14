package basics;

/*
 * Given a string, write a function that returns toggle case of a string using the bitwise operators in place.
*/

public class ToggleCase {

	public static String toggleCase(String s) {
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char)(ch[i] ^ 32);
		}
		return new String(ch);
	}
	
	public static void main(String[] args) {
		System.out.println("GeekSfOrgEEKs"+" ------> "+toggleCase("GeekSfOrgEEKs"));
		System.out.println("StRinG"+" ------> "+toggleCase("StRinG"));
	}
}
