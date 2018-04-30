package basics;

import java.util.Random;

public class CountOfTrailingOnes {

	public static int trailingOneCount(int num) {
		// converts trailing 1s to 0s
		int mask = num & (num+1);
		// clears everything to the left of trailing 1s
		return Integer.bitCount(mask ^ num); 
	}
	
	public static void main(String[] args) {
		Random gen = new Random();
		int input = gen.nextInt(500);
		System.out.println(input+" --> "+Integer.toBinaryString(input));
		System.out.println(trailingOneCount(input));
	}
}
