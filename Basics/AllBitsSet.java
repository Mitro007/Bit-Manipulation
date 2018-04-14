package basics;

public class AllBitsSet {
	
	/*
	 * Adding 1 to a number whose all bits are set results in a number which is a power of 2.
	 * e.g.    7(111)  + 1 =  8(1000)
	 * 		  15(1111) + 1 = 16(10000)
	*/
	public static boolean isAllBitsSet(int num) {
		return (num & (num+1)) == 0;
	}
	
	public static void main(String[] args) {
		int num=7;
		System.out.println(isAllBitsSet(num));
	}
}
