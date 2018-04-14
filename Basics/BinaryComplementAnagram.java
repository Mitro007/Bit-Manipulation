package basics;

/*
 * Given a positive number you need to check whether 
 * it’s complement and the number are anagrams or not.
*/

public class BinaryComplementAnagram {

	public static boolean isAnagram(int num) {
		return Integer.bitCount(num) == (Integer.SIZE >> 1);
	}
	
	public static void main(String[] args) {
		int input=0xffff;
		System.out.println(isAnagram(input));
	}
}
