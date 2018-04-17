package intermediate;

/*
 * A number is said to be a sparse number if in binary representation of the number 
 * no two or more consecutive bits are set. 
*/

public class SparseCheck {

	/*public static boolean isSparse(int num) {
		String s = Integer.toBinaryString(num);
		System.out.println(s);
		return !s.matches(".*(11+).*");
	}*/
	
	/*public static boolean isSparse(int num) {
		int prev=num & 1;
		while(num > 0) {
			num>>>=1;
			int cur=num & 1;
			if(prev==1 && cur==1)
				return false;
			prev=cur;
		}
		return true;
	}*/
	
	public static boolean isSparse(int num) {
		return (num & (num >>>= 1)) == 0;
	}
	
	public static void main(String[] args) {
		/*int input=72;
		System.out.println(Integer.toBinaryString(input));*/
		System.out.println(isSparse(72));
		System.out.println(isSparse(12));
		System.out.println(isSparse(2));
		System.out.println(isSparse(3));
	}
}
