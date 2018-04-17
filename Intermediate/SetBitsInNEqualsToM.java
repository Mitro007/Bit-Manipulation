package intermediate;

/*
 * You are given two 32-bit numbers, N and M, and two bit positions, i and j. 
 * Write a method to set all bits between i and j in N equal to M (e.g., M becomes a 
 * substring of N located at i and starting at j). 
*/

public class SetBitsInNEqualsToM {

	public static int setbits(int n,int m,int i,int j) {
		int mask1 = ~0 << (j+1);
		int mask2 = (1<<i) - 1;
		int mask = mask1 | mask2;
		n = n & mask;
		m = m<<i;
		return n | m;
	}
	
	public static void main(String[] args) {
		int n=2;
		int m=4;
		int i=2;
		int j=4;
		System.out.println(setbits(n, m, i, j));
	}
}
