package intermediate;

/*
 * Given an integer, count the number of trailing zeroes. 
*/

public class CountTrailingZeros {

	public static int countTrailingZeros(int num) {
		num = num & -num;
		return Integer.bitCount(num-1);
	}
	
	public static void main(String[] args) {
		int input=18;
		System.out.println(Integer.toBinaryString(input));
		System.out.println(countTrailingZeros(input));
	}
}
