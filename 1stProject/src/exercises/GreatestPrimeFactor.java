package exercitii;

import java.util.ArrayList;
import java.util.List;

//The prime factors of 13195 are 5, 7, 13 and 29.
//What is the largest prime factor of the number 600851475143 ?

public class GreatestPrimeFactor {

//	public static boolean prim(long n) {
//		for (long i = 2; i <= n / 2; i++) {
//			if (n % i == 0)
//				return false;
//		}
//		return true;
//	}
//
//	public static void main(String[] args) {
//
//		long n = 600851475143L;
//		long cmmfp = 0;
//
//		for (long i = 2; i <= n; i++) {
//			if ((n % i == 0) && (prim(i))) {
//				cmmfp = i;
//				n = n / i;
//			}
//		}
//		System.out.println(cmmfp);
//	}
	
	public static List<Integer> of(long n) {
		List<Integer> numbers = new ArrayList<>();
		
		for(int divizor = 2; n>1; divizor++) {
			while (n%divizor==0);
			numbers.add(divizor);
			n/=divizor;
		}
		return numbers;
	}
	 public static void main(String[] args) {
		of(600851475143L);
	}
}
