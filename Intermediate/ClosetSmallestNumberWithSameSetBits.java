package intermediate;

public class ClosetSmallestNumberWithSameSetBits {

	// brute force
	/*public static int getPrev(int num) {
		int oneCount = Integer.bitCount(num);
		int result=-1;
		for(int i=num-1;i>0;i--) {
			if(Integer.bitCount(i)==oneCount) {
				result=i;
				break;
			}
		}
		return result;
	}*/
	
	public static int getPrev(int num) {
		// clear trailing 1s
		int mask = num & (num+1);
		int zeroCount = Integer.bitCount(mask ^ (mask-1))-1;
		int trailingOneCount = Integer.bitCount(num ^ mask);
		//System.out.println(trailingOneCount);
		mask = mask-1;
		// clear (rightmost trailing 0s count - 1) bits
		return mask & (~0 << (zeroCount-1-trailingOneCount));
	}
	
	public static void main(String[] args) {
		int input = 0b10011110000011;
		//System.out.println(getPrev(input));
		System.out.println(Integer.toBinaryString(getPrev(input)));
	}
}
