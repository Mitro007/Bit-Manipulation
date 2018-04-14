package basics;

/*
 * For a given number n, if k-th bit is 0, then toggle it to 1 
 * and if it is 1 then, toggle it to 0.
*/

public class TogglingKthBit {

	public static int toggleBit(int num,int bitPosition) {
		//counting starts from zero so -1
		return num ^ (1 << (bitPosition-1));
	}
	
	public static void main(String[] args) {
		int num=75;
		int bitPosition=4;
		int result=toggleBit(num, bitPosition);
		System.out.println(Integer.toBinaryString(num));
		System.out.println(Integer.toBinaryString(result));
	}
}
