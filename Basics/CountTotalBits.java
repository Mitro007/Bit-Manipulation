package basics;

import java.util.Random;

public class CountTotalBits {

	public static int bitCount(int num) {
		return Integer.bitCount(SetAllBits.setAllBits(num));
	}
	
	public static void main(String[] args) {
		Random gen = new Random();
		int input = gen.nextInt(250);
		System.out.println(input+" --> "+Integer.toBinaryString(input));
		System.out.println(Integer.toBinaryString(input).length());
		System.out.println(bitCount(input));
	}
}
