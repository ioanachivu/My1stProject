package regEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// print an alphabetical list of the names of all users that have an @gmail address
public class regex {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        List<String> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
        	
            String[] firstNameEmailID = scanner.nextLine().split(" ");
            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];
            
            String toFind = "[a-z]+@gmail\\.com$";
            Pattern p = Pattern.compile(toFind);
            Matcher m = p.matcher(emailID);

            if (m.find()) {
                list.add(firstName);
            }
        }

        Collections.sort(list);
        
        for(String s:list) {
            System.out.println(s);
        }

        scanner.close();
    }
	
}
