package basics;

/*
 * Given a array such that all its terms is either 0 or 1.You need to tell the number represented by a subarray a[l..r] is odd or even. 
*/

public class BinaryArrayEvenOdd {

	public static String evenOdd(int[] a, int l,int r) {
		return a[r] == 1 ? "Odd" : "Even";
	}
	
	public static void main(String[] args) {
		int[] arr={1, 1, 0, 1};
		int l=0;
		int r=2;
		System.out.println(evenOdd(arr, l, r));
	}
}
