package basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Given an array where every element occurs three times, except one 
 * element which occurs only once. Find the element that occurs once.
*/
public class ElementThatAppearsOnce {

	public static int method1() {
		int uniqueElement= -1;
		List<Integer> numArray = Arrays.asList(12, 1, 12, 3, 12, 1, 1, 2, 3, 3);
		for (Integer integer : numArray) {
			if(Collections.frequency(numArray, integer) == 1) {
				uniqueElement=integer;
				break;
			}
		}
		return uniqueElement;
	}
	
	public static int method2(int[] a) {
		int uniqueElement=0;
		for(int i=0;i<32;i++) {
			int sum=0;
			int num=1<<i;
			for(int x: a) {
				if((x & num) != 0)
					sum++;
			}
			if((sum%3) != 0)
				uniqueElement |= num;
		}
		return uniqueElement;
	}
	
	public static int method3() {
		List<Integer> numList = Arrays.asList(12, 1, 12, 3, 12, 1, 1, 2, 3, 3);
		Set<Integer> numSet = new HashSet<>(numList);
		int sum1=0;
		int sum2=0;
		for (Integer integer : numSet) {
			sum2+=integer;
		}
		for (Integer integer : numList) {
			sum1+=integer;
		}
		return (3*sum2 - sum1)/2;
	}
	
	public static void main(String[] args) {
		//System.out.println(method1());
		//int[] a = {12, 1, 12, 3, 12, 1, 1, 2, 3, 3};
		//System.out.println(method2(a));
		System.out.println(method3());
	}
}
