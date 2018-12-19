package stringBuilder;
import java.util.Scanner;

// print:
//     #
//    ##
//   ###
//  ####
// #####
//######

public class staircaisePrint {
	public static void main(String[] args) {
		System.out.println("insert N:");
		Scanner in = new Scanner(System.in);
	    int n = in.nextInt();

	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i <n ; i++) {
	    	sb.append(" ");
	    }
	        
	    int j = 0;
	    for (int i = 1; i <=n; i++) {
	        sb.replace(sb.length()-i, sb.length()-j, "#");
	        System.out.println(sb);
	        j++;
	    }
	}
}
