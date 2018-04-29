package basics;

public class ClearBitsFromMSBToi {

	public static int clearBits(int num,int i) {
		int mask = (1 << (i-1)) -1;
		return num & mask;
	}
	
	public static void main(String[] args) {
		int num=222;
		int i=5;
		System.out.println(num+" --> "+Integer.toBinaryString(num));
		int result=clearBits(num, i);
		System.out.println(result+" --> "+Integer.toBinaryString(result));
	}
}
