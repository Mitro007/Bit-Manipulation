package basics;

import java.util.Random;

public class MultuplyWith7 {

	public static int mulWith7(int num) {
		return (num<<3) - num ;
	}
	
	public static void main(String[] args) {
		Random gen = new Random();
		int num=gen.nextInt(10);
		System.out.println(num);
		System.out.println(mulWith7(num));
	}
}
