package intermediate;

/*
 * Given two numbers you are required to check whether they are anagrams 
 * of each other or not in binary representation. 
*/

public class BinaryRepresentationAnagrams {

	public static boolean isAnagram(int num1,int num2) {
		return Integer.bitCount(num1) == Integer.bitCount(num2);
	}
	
	public static void main(String[] args) {
		int num1=5;
		int num2=4;
		System.out.println(isAnagram(num1, num2));
	}
}
