package intermediate;

public class AbsoluteValue {

	public static int abs(int num) {
		int mask = num >> 31;
		/*
		 * for +ve no. mask is 0 ==> 0|1 = 1
		 * for -ve no. mask is -1 ==> -1|1 = -1 
		*/
		mask|=1;
		return mask*num;
	}
	
	public static void main(String[] args) {
		int num1=0;
		int num2=2;
		int num3=-4;
		//System.out.println(-1|1);
		System.out.println(num1+" --> "+abs(num1));
		System.out.println(num2+" --> "+abs(num2));
		System.out.println(num3+" --> "+abs(num3));
	}
}
