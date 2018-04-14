package basics;

/*
 * Given a positive (or unsigned) integer n, write a function to
 * toggle all the bits except k-th bit. Here value of k starts 
 * from 0 (zero) and from right. 
*/

public class ToggleAllExceptKth {

	public static int toggleAll(int num,int k) {
		return num ^ ~(1<<k);
	}
	
	public static void main(String[] args) {
		int input=-1;
		int k=2;
		int result=toggleAll(input, k);
		System.out.println(Integer.toBinaryString(input));
		System.out.println(Integer.toBinaryString(result));
	}
}
