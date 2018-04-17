package intermediate;

public class UniqueCharacterString {

	/*public static boolean isUnique(String str) {
		System.out.println(str);
		Set s = new HashSet(Arrays.asList(str.split("")));
		System.out.println(s);
		return str.length() == s.size();
	}*/
	
	/*public static boolean isUnique(String str) {
		char[] s = str.toCharArray();
		Arrays.sort(s);
		for (int i = 0; i < s.length-1; i++) {
			if(s[i]==s[i+1])
				return false;
		}
		return true;
	}*/
	
	public static boolean isUnique(String str) {
		
		//with 8 bits 256 distinct values are possible.
		if(str.length() > 256)
			return false;
		
		char[] ch = str.toCharArray();
		int[] count = new int[256];
		for(Character c : ch) {
			if(count[c]==1)
				return false;
			count[c]++;
		}
		return true;
	}

	public static void main(String[] args) {
		String input="abcd10jk";
		System.out.println(isUnique(input));
		/*System.out.println(Integer.toBinaryString(-2));
		System.out.println(1<<30);
		System.out.println(1<<-2);*/
	}
}
