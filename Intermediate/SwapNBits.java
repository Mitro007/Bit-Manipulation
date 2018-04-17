package intermediate;

/*
 * Given a number x and two positions (from right side) in binary representation 
 * of x, write a function that swaps n bits at given two positions and returns 
 * the result. It is also given that the two sets of bits do not overlap. 
*/

public class SwapNBits {

	public static int swapBits(int num,int p1,int p2,int n) {
		int nSetBits = (1<<n) - 1;
		int leftBits = (num >>> p1) & nSetBits;
		//System.out.println(Integer.toBinaryString(leftBits));
		int rightBits = (num >>> p2) & nSetBits;
		//System.out.println(Integer.toBinaryString(rightBits));
		int xor = leftBits ^ rightBits;
		//System.out.println(Integer.toBinaryString(xor));
		xor = (xor << p1) | (xor << p2);
		//System.out.println(Integer.toBinaryString(xor));
		return num ^ xor;
	}
	
	public static void main(String[] args) {
		int input=28;
		int p1=0;
		int p2=3;
		int n=2;
		int result=swapBits(input, p1, p2,n);
		System.out.println(result);
	}
}
