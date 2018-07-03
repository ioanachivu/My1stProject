package teorie;
import java.util.Arrays;
import java.util.Scanner;

public class Vectori {
	public static void main(String[] args) {

		Scanner tast = new Scanner(System.in); // creare obj
		System.out.println("Introduceti n= "); // cout<<
		int n = tast.nextInt(); // cin>>

		int[] v = new int[n]; // declarare+ initializare

		System.out.println("introduceti numerele");
		
		for (int i=0; i<v.length; i++) 
			v[i] = tast.nextInt();
		System.out.println(Arrays.toString(v));
		
		/*
		for (int number : v) 
			number = tast.nextInt(); 
		System.out.println(Arrays.toString(v));  */

		tast.close();
	}
}	
 
/* pt fiecare numar din vector, efectueaza 
 
 for (int number:vector) {
 	System.out.println(number); 
 	}

*/