package basics;

public class SetAllBits {

	public static int setAllBits(int num) {
		// all bits are set
		if((num & (num+1)) != 0) {
			num |= num>>1;
			num |= num>>2;
			num |= num>>4;
			num |= num>>8;
			num |= num>>16;
		}
		return num;
	}
	
	public static void main(String[] args) {
		int num = 15;
		System.out.println(Integer.toBinaryString(num));
		System.out.println(Integer.toBinaryString(setAllBits(num)));
	}
}
