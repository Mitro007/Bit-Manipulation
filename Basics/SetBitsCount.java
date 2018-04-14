package basics;

public class SetBitsCount {

	public static int setBitsCount(int num) {
		return Integer.bitCount(num);
	}
	
	public static int setBitsCount2(int num) {
		int count=0;
		while(num>0) {
			/*if((num & 1) > 0)
				count++;*/
			count+=num&1;
			num>>=1;
		}
		return count;
	}
	
	public static int setBitsCount3(int num) {
		int count=0;
		while(num>0) {
			count++;
			num=num & (num-1); 
		}
		return count;
	}
	
	public static int setBitsCount4(int num) {
		int[] setBitsCount={0,1,1,2,1,2,2,3,1,2,2,3,2,3,3,4};
		int count=0;
		while(num >0) {
			count+=setBitsCount[num & 0Xf];
			num>>=4;
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(setBitsCount(20));
		System.out.println(setBitsCount2(20));
		System.out.println(setBitsCount3(20));
		System.out.println(setBitsCount4(15));
	}
}
