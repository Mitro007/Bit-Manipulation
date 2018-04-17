package basics;

/*
 * Write a modified strcmp function which ignores cases and returns -1 if s1 < s2,
 * 0 if s1 = s2, else returns 1.
*/

public class StringComparisonIgnoringCase {

	public static int strcmp(String s1,String s2) {
		int len1=s1.length();
		int len2=s2.length();
		int min = Math.min(len1, len2);
		
		for(int i=0;i<min;i++) {
			char ch1 = s1.charAt(i); 
			char ch2 = s2.charAt(i);
			//if(ch1 == ch2 || ch1 == (ch2 | 32 ) || (ch1 | 32 ) == ch2)
			if(ch1 == ch2 || (ch1 ^ ch2) == 32)
				continue;
			else {
				// suppose ch1 is lower case & ch2 is upper case letter
				if(ch1 > (ch2 | 32))
					return ch1 - (ch2 | 32);
				else
					return (ch1 | 32 ) - ch2;
			}
		}
		return len1 - len2;
	}
	
	public static void main(String[] args) {
		System.out.println("Using in-built method "+"Geeks".compareToIgnoreCase("apple"));
		System.out.println("Using user-defined method "+strcmp("Geeks", "apple"));
		System.out.println();
		
		System.out.println("Using in-built method "+"".compareToIgnoreCase("ABCD"));
		System.out.println("Using user-defined method "+strcmp("", "ABCD"));
		System.out.println();
		
		System.out.println("Using in-built method "+"ABCD".compareToIgnoreCase("z"));
		System.out.println("Using user-defined method "+strcmp("ABCD", "z"));
		System.out.println();
		
		System.out.println("Using in-built method "+"ABCD".compareToIgnoreCase("abcdEghe"));
		System.out.println("Using user-defined method "+strcmp("ABCD", "abcdEghe"));
		System.out.println();
		
		System.out.println("Using in-built method "+"GeeksForGeeks".compareToIgnoreCase("gEEksFORGeEKs"));
		System.out.println("Using user-defined method "+strcmp("GeeksForGeeks", "gEEksFORGeEKs"));
		System.out.println();
		
		System.out.println("Using in-built method "+"GeeksForGeeks".compareToIgnoreCase("geeksForGeeks"));
		System.out.println("Using user-defined method "+strcmp("GeeksForGeeks", "geeksForGeeks"));
		System.out.println();
		
		System.out.println("Using in-built method "+"Geel".compareToIgnoreCase("geekm"));
		System.out.println("Using user-defined method "+strcmp("Geel", "geekm"));
	}
}
