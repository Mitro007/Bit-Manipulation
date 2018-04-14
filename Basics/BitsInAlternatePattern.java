package basics;

/*
 * Given an integer n > 0, the task is to find whether this 
 * integer has an alternate pattern in its bits representation. 
*/

public class BitsInAlternatePattern {

	public static boolean isBitsAlternate(int num) {
		return (num & (num>>=1)) == 0 ;
	}
	
	public static boolean isBitsAlternate1(int num) {
		int prev=num%2;
		num/=2;
		while(num>0) {
			int cur=num%2;
			if(cur==prev)
				return false;
			prev=cur;
			num/=2;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int input=10;
		System.out.println(isBitsAlternate(input));
		System.out.println(isBitsAlternate1(input));
	}
}
