package basics;

import java.util.HashMap;
import java.util.Map;

/*
 * The problem is to convert the given binary number (represented as string) to its 
 * equivalent octal number. 
*/

public class BinaryToOctal {

	static final Map<String, Integer> lookUp = new HashMap<>();
	
	static {
		lookUp.put("000", 0);
		lookUp.put("001", 1);
		lookUp.put("010", 2);
		lookUp.put("011", 3);
		lookUp.put("100", 4);
		lookUp.put("101", 5);
		lookUp.put("110", 6);
		lookUp.put("111", 7);
	}
	
	public static void binToOctal(String str) {
		while(str.length() % 3 != 0)
			str="0"+str;
		String result="";
		for(int i=0;i<=str.length()-3;i+=3) {
			String key = str.substring(i, i+3);
			result = lookUp.get(key)+result;
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		String input="110001110";
		binToOctal(input);
	}
}
