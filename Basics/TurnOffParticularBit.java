package basics;

public class TurnOffParticularBit {

	public static int turnOffBit(int num,int bitPosition) {
		if(num<=0)
			return num;
		return num & ~(1<<bitPosition);
	}
	
	public static void main(String[] args) {
		int input=15;
		int bitPosition=5;
		System.out.println(input);
		System.out.println(turnOffBit(input, bitPosition-1));
	}
}
