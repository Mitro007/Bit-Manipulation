package basics;

public class TurnOffRightmostSetBit {

	public static int turnoffRightmostSetBit(int num) {
		int x=1;
		while((num & x) == 0)
			x<<=1;
		return num^x;
	}
	
	public static int turnoffRightmostSetBit2(int num) {
		return num & (num-1);
	}
	
	public static void main(String[] args) {
		System.out.println(turnoffRightmostSetBit(12));
		System.out.println(turnoffRightmostSetBit2(12));
	}

}
