package basics;

/*
 * Given a non-negative number n. 
 * The problem is to toggle the last m bits in the binary representation of n. 
 * A toggle operation flips a bit 0 to 1 and a bit 1 to 0.
*/

public class ToggleLastMBits {

	public static int toggleMBits(int num,int M) {
		return num ^ ((1<<M) -1);
	}
	
	public static void main(String[] args) {
		System.out.println(toggleMBits(21, 2));
		System.out.println(toggleMBits(107, 4));
	}
}
