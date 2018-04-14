package basics;

public class EqualNumbers {

	public static boolean isEqual(int num1,int num2) {
		return (num1^num2)==0;
	}
	
	public static void main(String[] args) {
		int num1=10;
		int num2=10;
		System.out.println(isEqual(num1, num2));
	}
}
