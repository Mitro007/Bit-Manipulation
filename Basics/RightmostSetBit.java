package basics;

public class RightmostSetBit {

	public static int rightmostSetBitPosition(int num) {
		return (int)(Math.log(num & -num) / Math.log(2)) + 1 ;
	}
	
	public static void main(String[] args) {
		int num=12;
		System.out.println(rightmostSetBitPosition(num));
	}
}
