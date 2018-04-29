package basics;

public class ClearBitsFromiToj {

	// Generate a mask of pattern 1+0+1+
	public static int clearBits(int num,int i,int j) {
		int ones = (1 << (i-1))-1;
		int zeros = -1<<j;
		int mask = ones | zeros;
		return num & mask;
	}
	
	public static void main(String[] args) {
		int num = 1500;
		int i=3;
		int j=7;
		System.out.println(num + " --> "+ Integer.toBinaryString(num));
		int result = clearBits(num, i, j);
		System.out.println(result+ " --> " + Integer.toBinaryString(result));
	}
}
