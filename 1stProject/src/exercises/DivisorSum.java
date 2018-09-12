package exercitii;

public class DivisorSum {

	public static int sumaDivizorilor(int n) {
	    int sum = 1; 
	    for(int i=2; i<=n/2; i++) {
	        if (n%i==0) {
	            sum += i;
	        }
	    }
	    return sum;
	}    
	    
public static void main(String[] args) {
	     int x =0;
	     int i =1;
	     int[] nrPerfect = new int[4];
	     
	     while (x<4) { 
	         i++;
	         if (sumaDivizorilor(i)==i) {
	             nrPerfect[x]=i;
	             x++;
	         }
	     }
	     for(int nr: nrPerfect) {
	         System.out.println(nr);
	     }
	 }
}
