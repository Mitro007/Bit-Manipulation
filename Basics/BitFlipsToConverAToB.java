package basics;

public class BitFlipsToConverAToB {

	public static int bitFlipCount(int num1,int num2) {
		return Integer.bitCount(num1^num2);
	}
	
	public static void main(String[] args) {
		int num1=10;
		int num2=7;
		System.out.println(bitFlipCount(num1, num2));
	}
}
