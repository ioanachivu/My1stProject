package exercises;

/*
Sample Input:
java 100
cpp 65
python 50

Sample Output:
================================
java           100 
cpp            065 
python         050 
================================
Explanation

Each String is left-justified with trailing whitespace through the first 15 characters. 
The leading digit of the integer is the 16th character, and each integer that was less than 3 digits now has leading zeroes.
 */

import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

import com.sun.xml.internal.ws.util.StreamUtils;

public class OutputFormatting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s1 = sc.next();
			int x = sc.nextInt();

			System.out.print(StringUtils.rightPad(s1, 15));
			System.out.println(StringUtils.leftPad(Integer.toString(x), 3, "0"));

		}
		System.out.println("================================");

	}
}
