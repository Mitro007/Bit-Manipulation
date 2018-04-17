package basics;

import java.util.Random;

public class ToggleAllBitsAfterMSB {

	public static int toggle(int num) {
		int mask = SetAllBits.setAllBits(num) >>> 1;
		return num ^ mask;
	}
	
	public static void main(String[] args) {
		Random gen = new Random();
		int input = gen.nextInt(50);
		System.out.println(Integer.toBinaryString(input));
		System.out.println(Integer.toBinaryString(toggle(input)));
	}
}
