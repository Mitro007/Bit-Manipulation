package basics;

public class EqualSumAndXor {

	public static int count(int num) {
		int zeroCount=0;
		while(num>0) {
			if((num & 1) == 0)
				zeroCount++;
			num>>>=1;
		}
		return 1<<zeroCount;
	}
	
	public static void main(String[] args) {
		int input=12;
		System.out.println(count(input));
	}
}
