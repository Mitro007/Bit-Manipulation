package basics;

/*
 * Given a sequence of three binary sequences A, B and C of N bits. 
 * Count the minimum bits required to flip in A and B such that XOR of 
 * A and B is equal to C. 
*/

public class AXorBToC {

	public static int bitCount(String a, String b, String c,int n) {
		char[] c1 = a.toCharArray();
		char[] c2 = b.toCharArray();
		char[] c3 = c.toCharArray();
		int count=0;
		for(int i=0;i<n;i++) {
			if((c1[i]==c2[i]) && c3[i] == '1')
				count++;
			else if ((c1[i] != c2[i]) && c3[i] == '0')
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		String a = "10100";
		String b = "00010";
		String c = "10011";
		int n = 5;
		System.out.println(bitCount(a, b, c, n));
	}
}
