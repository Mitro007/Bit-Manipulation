package intermediate;

public class ClearRightmostContiguousOnes {

	public static int clearOnes(int n) {
		// Approach 1
		/*
		 int mask = n + (n & (-n));
		 return n & mask;
		*/
		
		//approach 2
		//set all trailing 0's to 1's
		int mask = n | (n-1);
		//set all trailing 1's to 0's
		mask = mask+1;
		return n & mask;
	}
	
	public static void main(String[] args) {
		int input = 13948;
		System.out.println(Integer.toBinaryString(input));
		int result = clearOnes(input);
		System.out.println(Integer.toBinaryString(result));
	}
}
