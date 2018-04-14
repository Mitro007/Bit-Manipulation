package basics;

public class PowerOfTwo {

	public static boolean isPowerOfTwo(int num) {
		return (num & (num-1)) == 0 ;
	}
	
	public static boolean isPowerOfTwo1(int num) {
		if(num==0)
			return true;
		while(num % 2 == 0)
			num/=2;
		return num==1;
	}
	
	public static void main(String[] args) {
		int num=64;
		System.out.println(isPowerOfTwo(num));
		System.out.println(isPowerOfTwo1(num));
	}
}
