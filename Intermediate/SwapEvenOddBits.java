package intermediate;

/*
 * Given an unsigned integer, swap all odd bits with even bits. 
*/

public class SwapEvenOddBits {

	public static int swapEvenOddBits(int num) {
		int evenBits = num & 0xAAAAAAAA;
		int oddBits = num & 0x55555555;
		return (evenBits >>> 1) | (oddBits << 1);
	}
	
	public static void main(String[] args) {
		int input=23;
		int result=swapEvenOddBits(input);
		System.out.println(result);
	}
}
