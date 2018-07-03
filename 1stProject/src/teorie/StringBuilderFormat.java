package teorie;

public class StringBuilderFormat {
	public static void main(String[] args) {
		
		// StringBuilder:
		StringBuilder sb = new StringBuilder();
		
		sb.append("we like bananas");
		sb.append("...");
		sb.append("cause we are minions");
		
		System.out.println(sb.toString());
		
		//using methos-chaning:
		StringBuilder s = new StringBuilder();

		s.append("we like java").append("...").append("don't get desouraged");

		System.out.println(s.toString());

		// Formatting:
		System.out.print("some text\t here was a tab \n entered new line");
		System.out.println("/because we didn't use 'println' we dont have a new line");
		
		System.out.printf("total cost is %d & getting down to %d ready for %d\n", 100,50,20);
		
		for (int i=0; i<10; i++) {
			System.out.printf("%-2d: here is some text\n",i);
		}
		
		System.out.printf("Total value: %.2f \n", 5.6);
	}
}
