package basics;

/*
 * Given two non-negative numbers n and m. The problem is to 
 * find the smallest number having n number of set bits and m 
 * number of unset bits in its binary representation.
*/

public class SmallestNumber {

	public static int smallest(int n,int m) {
		int setBits = ((1 << (n+m)) - 1);
		int mask = ((1<<m) - 1) << (n-1);
		return setBits ^ mask;
	}
	
	public static int smallest1(int n,int m) {
		// to get 1 followed by n+m-1 0's .
		int num = (1 << (n+m)) >>> 1;
		int nMinusOneOnes = (1 << (n-1)) - 1;
		//setting last n-1 bits to 1.
		return num | nMinusOneOnes;
	}
	
	public static void main(String[] args) {
		int n=4;
		int m=3;
		int result=smallest(n, m);
		System.out.println(result);
		System.out.println(Integer.toBinaryString(result));
		System.err.println(Integer.toBinaryString(smallest1(n, m)));
	}
}
