package basics;

/*
 * Given a number n. Find sum of all number upto n whose 2 bits are set.
*/

public class SumWithTwoSetBits {

	public static int sum(int n) {
		int result =0;
		/*
		 * (1<<i) < n  NOT (1<<i) <= n
		 * because if 1<<i == n then we can't have other bit set but we want two bits 
		 * to be set.
		*/
		for(int i=1; (1<<i) < n; i++) {
			for(int j=0; j < i ;j++) {
				int sum = (1<<i) + (1<<j);
				if(sum<=n)
					result+=sum;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int input = 100;
		System.out.println(sum(input));
	}
}
