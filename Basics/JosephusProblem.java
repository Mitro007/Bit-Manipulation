package basics;

public class JosephusProblem {

	
	public static int survivePosition(int num) {
		int length = Integer.toBinaryString(num).length();
		num &= (1 << (length-1)) -1;
		num<<=1;
		return num | 1;
	}
	
	public static void main(String[] args) {
		for(int i=1;i<13;i++)
			System.out.println(survivePosition(i));
	}
}
