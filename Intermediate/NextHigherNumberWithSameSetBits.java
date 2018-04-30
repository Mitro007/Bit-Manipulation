package intermediate;

public class NextHigherNumberWithSameSetBits {

	public static int nextHigher(int num) {
		int oneCount = Integer.bitCount(num);
		int result;
		for(int i=num+1;;i++) {
			if(Integer.bitCount(i)==oneCount) {
				result=i;
				break;
			}
		}
		return result;
	}
	
	public static int nextNumber(int n) {
		int mask = n + (n & -n);
		//System.out.println(Integer.toBinaryString(mask));
		int rightmostOnesCount = Integer.bitCount(n ^ mask) - 1;
		//System.out.println(rightmostOnesCount);
		int setOnes = (1<<(rightmostOnesCount - 1)) - 1;
		return mask | setOnes;
	}
	
	public static void main(String[] args) {
		int num = 26;
		System.out.println(num + " --> "+Integer.toBinaryString(num));
		int result = nextNumber(num);
		System.out.println(nextHigher(num));
		System.out.println(result+" --> "+Integer.toBinaryString(result));
	}
}
