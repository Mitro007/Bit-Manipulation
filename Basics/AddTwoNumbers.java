package basics;

import java.util.Random;

public class AddTwoNumbers {

	public static int add(int num1,int num2) {
		int carry;
		while(num2 != 0) {
			carry = num1 & num2;
			num1 = num1 ^ num2;
			num2 = carry << 1;
		}
		return num1;
	}
	
	public static void main(String[] args) {
		Random gen = new Random();
		int num1 = gen.nextInt(20);
		int num2 = gen.nextInt(20);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(add(num1, num2));
	}
}
