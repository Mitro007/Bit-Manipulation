package basics;

/*
 *Given a number having only one ‘1’ and all other ’0’s in its binary representation, find position of the only set bit.  
*/

public class OnlySetBitPosition {

	public static int setBitPosition(int num) {
		if((num & (num-1)) != 0)
			return -1;
		return (int)(Math.log(num)/Math.log(2)) + 1 ;
	}
	
	public static void main(String[] args) {
		int num=16;
		int num1=12;
		int num2=128;
		System.out.println(setBitPosition(num));
		System.out.println(setBitPosition(num1));
		System.out.println(setBitPosition(num2));
	}
}
