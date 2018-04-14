package basics;

/*
 * Given a Binary Number as string, print its 2’s complements. 
*/

public class TwosComplement {

	/*public static void twoComplement(int num) {
		int m=1;
		while((num & m) == 0)
			m<<=1;
		m<<=1;
		while(m<=num) {
			num^=m;
			m<<=1;
		}
		System.out.println(Integer.toBinaryString(num));
	}*/
	
	public static String twosComplement(String s) {
		char[] ch=s.toCharArray();
		if(s.indexOf("1") == -1)
			return "1"+s;
		int index = s.lastIndexOf("1");
		for(int k=index-1;k>=0;k--){
			if(ch[k]=='1')
				ch[k]='0';
			else
				ch[k]='1';
		}
		return new String(ch);
	}
	
	public static void main(String[] args) {
		String input = "0000";
		System.out.println(input);
		System.out.println(twosComplement(input));
	}
}
