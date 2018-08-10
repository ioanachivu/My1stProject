package exercitii;

public class nrPrim {
	
	public static void prim(int n) {
	int s = 0;
	for(int i=3; i<= n/2; i++) {
		if(n % i == 0) s=1;
		else s=0;
	}
	
	if (s==0) System.out.println("e prim");
	else System.out.println("nu e prim");	
}
	
	public static void main(String[] args) {
		prim(13);
	}
}
