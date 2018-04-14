package basics;

public class XOR {

	public static int xor(int num1,int num2) {
		
		//(0,1) combination gives 1 ==> OR
		/*
		 * 0 ^ 0 , 0 | 0 = 0
		 * 0 ^ 1 , 0 | 1 = 1
		 * 1 ^ 0 , 1 | 0 = 1
		*/
		int res=num1^num2;
		// & gives common set bits 
		int setBits=num1 & num2;
		//make all set bits to zero
		return res & ~(setBits); 
	}
	
	public static void main(String[] args) {
		int num1=23;
		int num2=55;
		System.out.println(num1^num2);
		System.out.println(xor(num1, num2));
	}
}
