package basics;

public class RotateBits {
	
	public static int leftRotate(int num,int shift) {
		return (num << shift) | (num >> (Integer.SIZE-shift)); 
	}
	
	public static int rightRotate(int num,int shift) {
		return (num >> shift) | (num << (Integer.SIZE-shift));
	}
	
	public static void main(String[] args) {
		int num = 0b11100101;
		System.out.println(Integer.toBinaryString(num));
		System.out.println(Integer.toBinaryString(leftRotate(num, 3)));
		System.out.println(Integer.toBinaryString(rightRotate(num, 3)));
		
		System.out.println();
		System.out.println(Integer.toBinaryString(-5));

	}
}
