package basics;

public class FirstAndLastBitsSet {

	public static boolean isFirstLastBitsSet(int num) {
		if(num==1)
			return true;
		else if((num & (num-1))==0)
			return false;
		else {
			num = num-1;
			return (num & (num-1)) == 0;
		}
	}
	
	public static void main(String[] args) {
		for(int i=1;i<10;i++)
			System.out.println(i+" --> "+isFirstLastBitsSet(i));
	}
}
