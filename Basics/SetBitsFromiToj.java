package basics;

public class SetBitsFromiToj {

	// generate a mask of pattern 0+1+0+
	public static int setBits(int num,int i,int j) {
		int zeros = -1 << (i-1);
		int ones = (1<<j) - 1;
		int mask = zeros & ones;
		return num | mask;
	}
	
	public static void main(String[] args) {
		int num = 1348;
		int i=3;
		int j=7;
		System.out.println(num + " --> "+ Integer.toBinaryString(num));
		int result = setBits(num, i, j);
		System.out.println(result+ " --> " + Integer.toBinaryString(result));
	}
}
