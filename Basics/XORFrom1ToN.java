package basics;

import java.util.Random;

/*
 * Given a number n, the task is to find the XOR from 1 to n. 
*/

public class XORFrom1ToN {

	public static int xorToN(int num) {
		int result=0;
		for(int i=1;i<=num;i++)
			result=result^i;
		return result;
	}
	
	public static int xorToN1(int num) {
		if(num%4==3)
			return 0;
		else if(num%4==2)
			return num+1;
		else if(num%4==1)
			return 1;
		return num;
	}
	
	public static int xorToN2(int num) {
		// Modulus operator are expensive on most of the 
	    // computers. n & 3 will be equivalent to n % 4.
		
		switch(num & 3) {
			//case 0 : return num;
			case 1 : return 1;
			case 2 : return num+1;
			case 3 : return 0; 
			default : return num;
		}
	}
	
	public static void main(String[] args) {
		Random gen = new Random();
		int input=gen.nextInt(50);
		System.out.println(xorToN(input));
		System.out.println(xorToN1(input));
		System.out.println(xorToN2(input));
	}
}
