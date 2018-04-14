package basics;

import java.util.Random;
import java.util.Stack;

public class BinaryRepresentation {
	
	public static String binaryRepresentation(int num) {
		StringBuffer bin = new StringBuffer();
		Stack<Integer> bits = new Stack<>();
		while(num!=0) {
			bits.push(num%2);
			num/=2;
		}
		while(!bits.empty())
			bin.append(bits.pop());
		
		return bin.toString();
	}
	
	public static String binaryRepresntation1(int num) {
		StringBuffer bin = new StringBuffer();
		int index=0;
		int[] bit=new int[32];
		
		while(num>0) {
			bit[index++]=num & 1;
			num>>=1;
		}
		
		while(index-- > 0)
			bin.append(bit[index]);
		
		return bin.toString();
	}
	
	public static void main(String[] args) {
		Random gen = new Random();
		int num=gen.nextInt(500);
		System.out.println(Integer.toBinaryString(num));
		System.out.println(binaryRepresentation(num));
		System.out.println(binaryRepresntation1(num));
	}
}
