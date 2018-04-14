package basics;

/*
 * Given a number, the task is to find XOR of count of 0s and count of 1s in binary representation of a given number.
*/

public class XOROfZerosAndOnes {

	public static int xorOfZerosOnes(int num) {
		int bitCount = Integer.toBinaryString(num).length();
		int onesCount = Integer.bitCount(num); 
		return onesCount ^ (bitCount - onesCount);
	}
	
	public static void main(String[] args) {
		int input=31;
		System.out.println(xorOfZerosOnes(input));
	}
}
