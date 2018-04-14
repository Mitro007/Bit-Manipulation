package basics;

public class UnsetLastMBits {

	public static void unsetLastMBits(int num,int m) {
		int result = num & (~0 << m);
		System.out.println(Integer.toBinaryString(result));
	}
	
	public static void main(String[] args) {
		int input=155;
		int m=5;
		System.out.println(Integer.toBinaryString(input));
		unsetLastMBits(input, m);
	}
}
