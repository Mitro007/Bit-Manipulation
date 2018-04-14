package basics;

public class SetTrailingZeros {

	public static int trailingZeros(int num) {
		return num | (num-1);
	}
	
	public static void main(String[] args) {
		int input=0b1011010000;
		System.out.println(Integer.toBinaryString(input));
		int result = trailingZeros(input);
		System.out.println(Integer.toBinaryString(result));
	}
}
