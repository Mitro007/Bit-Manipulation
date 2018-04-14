package basics;

/*
 * Given two non-negative numbers n and m. The problem is to 
 * find the largest number having n number of set bits and m 
 * number of unset bits in its binary representation.
*/

public class LargestNumber {

	public static int largestNumber(int n,int m) {
		int setBits = (1 << (n+m)) - 1;
		//System.out.println(Integer.toBinaryString(setBits));
		return setBits & (~0 << m);
	}
	
	public static int largestNumber1(int n,int m) {
		return ((1 << n) - 1) << m;
	}
	
	public static void main(String[] args) {
		int n=4;
		int m=1;
		int result=largestNumber(n, m);
		System.out.println(result);
		System.err.println(Integer.toBinaryString(largestNumber1(n, m)));
		System.out.println(Integer.toBinaryString(result));
	}
}
