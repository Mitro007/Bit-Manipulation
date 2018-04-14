package basics;

import java.util.Random;

/*
 * Given a integer x, write a function that multiplies x with 3.5 and returns the integer result. You are not allowed to use %, /, *.
 */
public class Multipliply {

	public static int multiplyWith3Point5(int num) {
		//return (num<<1) + num + (num>>1);
		return ((num<<3)-num)>>1;
	}
	
	public static void main(String[] args) {
		Random gen = new Random();
		int input= gen.nextInt(100);
		System.out.println(input);
		System.out.println((int)(input*3.5));
		System.out.println(multiplyWith3Point5(input));
	}
}
