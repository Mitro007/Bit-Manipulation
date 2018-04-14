package basics;

import java.util.Random;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		Random gen=new Random();
		int num1=gen.nextInt(30);
		int num2=gen.nextInt(30);
		
		System.out.println("Before Swapping :"+num1+"    "+num2);
		
		num1=num1^num2;
		num2=num1^num2;
		num1=num1^num2;
		
		System.out.println("After Swapping :"+num1+"    "+num2);
	}
}
