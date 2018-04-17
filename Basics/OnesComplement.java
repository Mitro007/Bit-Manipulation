package basics;

import java.util.Random;

public class OnesComplement {

	/*public static String oneComplement(int num) {
		int bitString=Integer.toBinaryString(num).length();
		int ones=(1<<bitString)-1;
		return Integer.toBinaryString(num ^ ones);
	}*/
	
	public static int oneComplement(int n) {
		int m=1;
		while(m<=n) {
			n=n^m;
			m<<=1;
		}
		return n;
	}
	
	public static int oneComplement1(int n) {
		return n ^ SetAllBits.setAllBits(n);
	}
	
	public static void main(String[] args) {
		Random gen = new Random();
		int input = gen.nextInt(50);
		System.out.println(Integer.toBinaryString(input));
		System.out.println(Integer.toBinaryString(oneComplement(input)));
		System.out.println(Integer.toBinaryString(oneComplement1(input)));
	}
}
