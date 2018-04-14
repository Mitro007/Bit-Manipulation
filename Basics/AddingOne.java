package basics;

import java.util.Random;

public class AddingOne {

	/*
	 * Flip all the bits from the rightmost unset bit(0) including it.
	*/
	public static int addOne(int num) {
		int x=1;
		while((num & x) != 0) {
			num^=x;
			x<<=1;
		}
		return num^x;
	}
	
	public static int addOne2(int num) {
		return -(~num);
	}
	
	public static void main(String[] args) {
		Random gen = new Random();
		int input= gen.nextInt(100);
		System.out.println(input);
		System.out.println(addOne(input));
		System.out.println(addOne2(input));
	}
}
