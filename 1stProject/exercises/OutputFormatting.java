package exercises;

import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

import com.sun.xml.internal.ws.util.StreamUtils;
public class OutputFormatting {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                
                System.out.print(StringUtils.rightPad(s1, 15));
                System.out.println(StringUtils.leftPad(Integer.toString(x), 3, "0"));
            
            }
            System.out.println("================================");

    }
}



