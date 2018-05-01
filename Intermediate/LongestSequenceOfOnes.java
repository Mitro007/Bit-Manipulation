package intermediate;

/*
 * Give an integer n. We can flip exactly one bit. Write code to find
 * the length of the longest sequence of 1 s you could create.
*/

public class LongestSequenceOfOnes {

	public static int flip(int num) {
		if(~num == 0)
			return 32;
		int curLength=0;
		int prevLength=0;
		int maxLength=0;
		while(num>0) {
			if((num&1)==1)
				curLength++;
			else {
				prevLength=(num&2)==0?0:curLength;
				curLength=0;
			}
			maxLength=Math.max(curLength+prevLength, maxLength);
			num>>>=1;
		}
		// adding one for flip bit count
		return maxLength+1;
	}
	
	public static void main(String[] args) {
		/*int input=15;
		System.out.println(Integer.toBinaryString(input));
		int result=flip(input);
		System.out.println(result);*/
		System.out.println(flip(1775));
		System.out.println(flip(12));
		System.out.println(flip(15));
		System.out.println(flip(71));
	}
}
