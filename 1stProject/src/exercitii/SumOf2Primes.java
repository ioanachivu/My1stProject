package exercitii;

import java.util.Scanner;

public class SumOf2Primes {
	static int m, n;
	
	public static void giveNo() {
		System.out.println("Please insert m:");
		Scanner in = new Scanner(System.in);
		m = in.nextInt();
		
		System.out.println("Please insert n:");
		n = in.nextInt();
	}
	
	public static boolean prim(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
	
	public static void verifyNo (int n) {
		int a,b;
		if (n%2==0) {
			for (int i=2; i<n/2; i++) {
				if (prim(i)) {
					b=n-i;
                                        if(prim(b)) {
                                            a=i;
                                            System.out.println(n+" = "+a+" + "+b);
                                            break;
                                        }
			}
		}
		
	} 
        }
	
	public static void main(String[] args) {
		giveNo();
		for (int i=m; i<=n; i++) {
			verifyNo(i);
			}
	}
}
