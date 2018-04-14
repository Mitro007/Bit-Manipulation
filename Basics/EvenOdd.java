package basics;

public class EvenOdd {

	public static String isEven(int num) {
		return ((num & 1) == 0) ? "Even" : "Odd" ;
	}
	
	public static void main(String[] args) {
		int num=2;
		System.out.println(isEven(num));
	}
}
