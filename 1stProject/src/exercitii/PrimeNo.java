package exercitii;

import java.util.Scanner;

public class PrimeNo {
	
	public static boolean prim(long n) {
		for (long i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {

		long n = 600851475143L;
		//long n = 13195;
		
		for(long i = n/2; i>0; i--) {
			if ((n%i==0) && (prim(i))) {
				System.out.println(i);
				break;
			}
		}
	}
}
