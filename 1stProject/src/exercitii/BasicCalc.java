package exercitii;
import java.util.Scanner; 

public class BasicCalc {
	public static void main(String[] args) {
		
		double fnum, snum, result;
		Scanner ioana = new Scanner(System.in);
		System.out.println(" dati primul nr");
		fnum = ioana.nextDouble();
		
		System.out.println("dati al doilea nr");
		snum = ioana.nextDouble();
		
		result = fnum + snum;
		System.out.println(result);
		
		ioana.close();
	}
}
