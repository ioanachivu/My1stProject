package switchEx;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		int i = 0;
		while (i == 0) {
			try {
				Scanner day = new Scanner(System.in);
				System.out.println("dati ziua sapt - int: ");
				int d = day.nextInt();
				switch (d) {
				case 1:
					System.out.println("Monday");
					break;
				case 2:
					System.out.println("Tuesday");
					break;
				case 3:
					System.out.println("Wednesday");
					break;
				case 4:
					System.out.println("Thursday");
					break;
				case 5:
					System.out.println("Friday");
					break;
				default:
					System.out.println("it's weekend baby");
					day.close();
					} 
				++i;
			} catch (Exception e) {
				System.out.println("Access denied!");
			}
		} 
	}
}
