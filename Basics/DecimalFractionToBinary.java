package basics;

/*
 * Given an fraction decimal number n and integer k, convert decimal number n 
 * into equivalent binary number up-to k precision after decimal point.
*/

public class DecimalFractionToBinary {

	public static String binaryIntegral(int num) {
		return BinaryRepresentation.binaryRepresentation(num);
	}
	
	public static String binaryFractional(double fraction,int k) {
		StringBuffer sb = new StringBuffer();
		//double num = Double.parseDouble(fraction);
		//double res=num*2;
		double res=fraction*2;
		for(int i=0;i<k;i++) {
			int ires=(int)res;
			sb.append(ires);
			res=(res-ires)*2;
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		double input=4.47;
		int k=3;
		int a=(int)input;
		double b = input-a;
		//String[] s = Double.toString(input).split("\\.");
		//String integral = binaryIntegral(Integer.parseInt(s[0]));
		String integral = binaryIntegral(a);
		//String fractional  = binaryFractional("0."+Integer.parseInt(s[1]), k);
		String fractional  = binaryFractional(b, k);
		System.out.println(integral+"."+fractional);
	}
}
