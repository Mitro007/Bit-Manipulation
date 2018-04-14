package basics;

public class OppositeSign {

	public static boolean isOppositeSign(int num1,int num2) {
		return (num1^num2) < 0;
	}
	
	public static boolean isOppositeSign2(int num1,int num2) {
		return (num1^num2)>>31 != 0;
	}
	
	public static void main(String[] args) {
		int num1=4;
		int num2=5;
		//System.out.println(isOppositeSign(num1, num2));
		System.out.println(isOppositeSign2(num1, num2));
	}

}
