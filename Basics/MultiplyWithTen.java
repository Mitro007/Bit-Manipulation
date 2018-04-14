package basics;

import java.util.Random;

/*
 * Given a number, the task is to multiply it with 10
 * without using multiplication operator
*/

public class MultiplyWithTen {

	public static int multiplyTen(int num) {
		return (num<<3) + (num <<1);
	}
	
	public static void main(String[] args) {
		Random gen = new Random();
		int input = gen.nextInt(50);
		System.out.println(input*10);
		System.out.println(multiplyTen(input));
	}
}
