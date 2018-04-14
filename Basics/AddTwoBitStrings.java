package basics;

public class AddTwoBitStrings {

	public static void addBitStrings(String s1,String s2) {
		
		//Making both strings of same length
		if(s1.length()<s2.length()) {
			while(s1.length() != s2.length())
				s1="0"+s1;
		}
		else {
			while(s2.length() != s1.length())
				s2="0"+s2;
		}
		System.out.println(s1);
		System.out.println(s2);
		String result="";
		int carry=0;
		for(int i=s1.length()-1;i>=0;i--) {
			int firstBit=s1.charAt(i)-'0';
			int secondBit=s2.charAt(i)-'0';
			int sum=firstBit^secondBit^carry;
			result=sum+result;
			carry = (firstBit & carry) | (secondBit & carry) | (firstBit & secondBit);
		}
		
		if(carry == 1)
			result="1"+result;
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		String input1="1100011";
		String input2="1111111";
		addBitStrings(input1, input2);
		
	}
}
