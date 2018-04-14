package basics;

/*
 * Given a non-negative number n. The problem is to set the rightmost unset bit in the binary representation of n. 
 * If there are no unset bits, then just leave the number as it is.
 */

public class SetRightmostUnsetBit {

	public static int setUnsetBit(int num) {
		//if all bits are set
		if(num == ((1<<Integer.toBinaryString(num).length()) -1 ))
			return num;
		return num | (num+1);
	}
	
	public static void main(String[] args) {
		int num=21;
		System.out.println(Integer.toBinaryString(num));
		int result=setUnsetBit(num);
		System.out.println(Integer.toBinaryString(result));
	}
}
