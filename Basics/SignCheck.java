package basics;

public class SignCheck {

	public static boolean isPositive(int num) {
		return (num >> 31) == 0;
	}
	
	public static void main(String[] args) {
		int input1=5;
		int input2=-3;
		int input3=0;
		System.out.println(input1+" --> "+isPositive(input1));
		System.out.println(input2+" --> "+isPositive(input2));
		System.out.println(input3+" --> "+isPositive(input3));
	}
}
