package basics;

public class SwapNibblesInByte {

	public static byte swapNibbles(byte num) {
		//BinaryRepresentation.binaryRepresentation(num);
		byte result=(byte)(((num << 4) & 0xff) | ((num >> 4) & 0xff));
		//BinaryRepresentation.binaryRepresentation(result);
		return result;
	}
	
	
	public static byte swapNibbles1(int num) {
		return (byte)(((num & 0x0f)<<4) | ((num & 0xf0)>>4));
	}
	
	public static void main(String[] args) {
		byte input=(byte)100;
		System.out.println(swapNibbles(input));
		System.out.println(swapNibbles(input));
	}
}
