package basics;

public class LastFiveDigitsOfInteger {

	// Wrong Approach
	/*public static int lastFiveDigits(int num) {
		int mask = (1<<5)-1;
		return num & mask;
	}*/
	
	public static int lastDigits(int num, int noOfdigits) {
		return num % (int)Math.pow(10, noOfdigits);
	}
	
	public static void main(String[] args) {
		int num = 123456789;
		//System.out.println(lastFiveDigits(num));
		int result = lastDigits(num, 5);
		System.out.println(result+" --> "+Integer.toBinaryString(result));
		
	}
}
