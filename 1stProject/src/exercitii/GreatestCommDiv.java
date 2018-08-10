package exercitii;

// find the greatest common divider of two numbers

public class GreatestCommDiv {
	
	public static int gCD(int n, int m) {

		if (n == m) {
			System.out.println("The numbers are equal");
		} 

		while ((n != 0) && (m != 0)) {
			if (n > m) {
				n = n % m;
			} else {
				m = m % n;
			}
		}
		if (n < m)
			return m;
		else
			return n;
	}
	
	public static void main(String[] args) {
		System.out.println(gCD(120,150));
		
	}
}
