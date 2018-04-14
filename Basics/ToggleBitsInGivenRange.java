package basics;

/*
 * Given a non-negative number n and two values l and r. 
 * The problem is to toggle the bits in the range l to r in 
 * the binary representation of n, i.e, to toggle bits from 
 * the rightmost lth bit to the rightmost rth bit. 
 * A toggle operation flips a bit 0 to 1 and a bit 1 to 0.
*/

public class ToggleBitsInGivenRange {

	public static int toggleBits(int num,int l,int r) {
		if(num==0)
			return num;
		int mask = ((1 << (r-l+1)) - 1) << (l-1);
		//System.out.println(Integer.toBinaryString(mask));
		return num ^ mask;
	}
	
	public static void main(String[] args) {
		int input=50;
		int l=2;
		int r=5;
		int result=toggleBits(input, l, r);
		System.out.println(Integer.toBinaryString(input));
		System.out.println(Integer.toBinaryString(result));
		System.out.println(result);
	}
}
