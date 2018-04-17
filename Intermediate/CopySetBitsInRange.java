package intermediate;

/*
 * Given two numbers x and y, and a range [l, r] where 1 <= l, r <= 32. 
 * The task is consider set bits of y in range [l, r] and set these bits in x also. 
*/

public class CopySetBitsInRange {

	public static int setBits(int x,int y,int l,int r) {
		int noOfOnesInGivenRange = (1 << (r-l+1)) - 1; 
		int mask = noOfOnesInGivenRange	<< (l-1);
		mask = y & mask;
		return x | mask;
	}
	
	public static void main(String[] args) {
		int x=10;
		int y=13;
		int l=2;
		int r=3;
		System.out.println("Initial representation --> "+Integer.toBinaryString(x));
		int result = setBits(x, y, l, r);
		System.out.println(result);
		System.out.println("After setting bit --> "+Integer.toBinaryString(result));
	}
}
