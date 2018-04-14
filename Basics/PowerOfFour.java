package basics;

/*
 * A number which is power of four has only one set bit
 * followed by even number of 0s.
*/

public class PowerOfFour {

	public static boolean isPowerOfFour(int num) {
		while(num%4 == 0)
			num/=4;
		return num==1;
	}
	
	public static boolean isPowerOfFour1(int num) {
		//has only one set bit
		if((num & (num-1))==0) {
			num=num-1;
			//even number of 0s or not ?
			return Integer.bitCount(num) % 2 == 0;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isPowerOfFour(64));
		System.out.println(isPowerOfFour1(64*64));
	}

}
