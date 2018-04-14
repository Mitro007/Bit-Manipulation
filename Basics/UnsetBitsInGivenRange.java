package basics;

/*
 *Given a non-negative number n and two values l and r. 
 *The problem is to unset the bits in the range l to r in the 
 *binary representation of n, i.e, to unset bits from the rightmost 
 *lth bit to the rightmost rth bit. 
*/

public class UnsetBitsInGivenRange {

	public static int unsetBits(int num,int l,int r) {
		if(num==0)
			return num;
		int mask= ~(((1<<(r-l+1)) - 1) << (l-1));
		//System.out.println(Integer.toBinaryString(mask));
		return num & mask;
	}
	
	public static void main(String[] args) {
		int input=123;
		int l=2;
		int r=5;
		int result=unsetBits(input, l, r);
		System.out.println(Integer.toBinaryString(input));
		System.out.println(Integer.toBinaryString(result));
		System.out.println(result);
	}
}
