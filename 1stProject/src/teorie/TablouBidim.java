package teorie;
import java.util.Scanner;
import java.util.Arrays;

public class TablouBidim {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); // creare obiect
		System.out.println("dati n="); // cout<<

		int n = in.nextInt();  // declarare
		int[][] v = new int[n][n]; // initializare

		/*
		for (int i = 0; i < v.length; i++) {
			v[i] = new int[i + 1];
			for (int j = 0; j < v[i].length; j++)
				v[i][j] = j + 1; 
		} */
		
		for (int i = 0; i < v.length; i++) {
			System.out.println("dati numerele pt randul: "+ (i+1));
			for (int j = 0; j < v[i].length; j++)
				v[i][j] = in.nextInt();
		}		
		
		
		for (int[] it : v) {
			System.out.println(Arrays.toString(it));
		}
		
		in.close();
	}
    
}
