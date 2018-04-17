package basics;

public class HighestPowerOfTwo {

	public static int highestPowerOfTwo(int num) {
		if((num & (num-1)) == 0)
			return num;
		else {
			int mask = SetAllBits.setAllBits(num);
			mask+=1;
			return mask >> 1;
		}
	}
	
	public static void main(String[] args) {
		int input = 0b10101011;
		System.out.println(highestPowerOfTwo(input));
	}
}
