package basics;

import java.util.Random;

public class CountofTrailingZeros {

	public static int trailingZeroCount(int num) {
		return Integer.bitCount(num ^ (num-1))-1;
	}
	
	public static void main(String[] args) {
		Random gen = new Random();
		int input = gen.nextInt(500);
		System.out.println(input+" --> "+Integer.toBinaryString(input));
		System.out.println(trailingZeroCount(input));
	}
}

