package basics;

public class ClearTrailingOnes {

	public static int trailingOnes(int num) {
		return num & (num+1);
	}
	
	public static void main(String[] args) {
		int input = 0b1101101011111;
		System.out.println(Integer.toBinaryString(input));
		int result= trailingOnes(input);
		System.out.println(Integer.toBinaryString(result));
	}
}
