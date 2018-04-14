package basics;

import java.util.Random;

public class SubtractingOne {

	public static int subtractOne(int num) {
		return ~(-num);
	}
	
	/*
	 * Flip all the bits from the rightmost set bit(1) including it. 
	*/
	public static int subtractOne2(int num) {
		int x=1;
		while((num & x) == 0) {
			num^=x;
			x<<=1;
		}
		return num^x;
	}
	
	public static void main(String[] args) {
		Random gen = new Random();
		int input= gen.nextInt(100);
		System.out.println(input);
		System.out.println(subtractOne(input));
		System.out.println(subtractOne2(input));
	}
}
