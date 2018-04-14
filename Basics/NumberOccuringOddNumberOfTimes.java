package basics;

/*
 * Given an array of positive integers. All numbers occur even number of 
 * times except one number which occurs odd number of times.
 */
public class NumberOccuringOddNumberOfTimes {

	public static int unique(int[] a) {
		int result=0;
		for (int i : a) {
			result^=i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] a={1, 2, 3, 2, 3, 1, 3};
		System.out.println(unique(a));
	}
}
