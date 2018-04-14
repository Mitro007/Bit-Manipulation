package basics;

import java.util.Random;

public class RussianPeasant {

	public static int multiply(int first,int second) {
		int result=0;
		while(second > 0) {
			/*if(second % 2 != 0)
				result+=first;*/
			if((second & 1) != 0 )
				result+=first;
			first<<=1;
			second>>=1;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Random gen = new Random();
		int num1=gen.nextInt(20);
		int num2=gen.nextInt(20);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(multiply(num1, num2));
	}
}
