package lessons;

import java.util.Scanner;

public class ExceptionExe {
	public static void main(String[] args) {
		int i = 0;
		do {
			try {
				Scanner input = new Scanner(System.in);
				System.out.println("Dati primul nr");
				int nr1 = input.nextInt();
				
				System.out.println("Dati nr 2");
				int nr2 = input.nextInt();
				
				int rez = nr1 / nr2;
				System.out.println(rez);
				++i;
				input.close();
			} catch (Exception e) {
				System.out.println("Access denied");
			}
		} while (i == 0);
		

	}
}
