package basics;

/*
 * Compute n modulo d without division(/) and modulo(%) operators, 
 * where d is a power of 2 number.
*/

public class ModulusDivisonByPowerOfTwo {

	public static int modulus(int n,int d) {
		return n & (d-1);
	}
	
	public static void main(String[] args) {
		int n=6;
		int d=8;
		System.out.println(modulus(n, d));
	}
}
