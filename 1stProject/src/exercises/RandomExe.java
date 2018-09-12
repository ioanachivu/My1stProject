package exercitii;

import java.util.Random;

public class RandomExe {
	public static void main(String[] args) {
		Random number = new Random ();
		
		int i = number.nextInt(10);
		System.out.println(i);
		
		i = number.nextInt(10);
		System.out.println(i);
		
		i = number.nextInt(10);
		System.out.println(i);
	}
}
