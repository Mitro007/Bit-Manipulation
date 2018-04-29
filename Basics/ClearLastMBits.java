package basics;

public class ClearLastMBits {

	public static int clearMBits(int num,int m) {
		return num & (~0<<m);
	}
	
	public static void main(String[] args) {
		int num=222;
		int m=3;
		System.out.println(num+" --> "+Integer.toBinaryString(num));
		int result=clearMBits(num, m);
		System.out.println(result+" --> "+Integer.toBinaryString(result));
	}
}
