package exercises;

	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;
	
	public class Main {
		
		static boolean isPrime(int n) {
			for (int i=2; i<=n/2; i++) {
				if (n%i == 0) return false;
			}
			return true;
		}
		
	    public static void main(String[] args) {
	        int[] vector = null;
	        Integer result = null;
	       // try (Scanner scanner = new Scanner(new File(args[0]))) {
	            String[] numberTokens = args[0].split(",");
	            vector = new int[numberTokens.length];
	            for (int i = 0; i < numberTokens.length; i++) {
	                vector[i] = Integer.parseInt(numberTokens[i]);
	            }
//	        }
//	        catch (FileNotFoundException ex) {
//	            throw new RuntimeException(ex);
//	        }       
	        
	        result = Integer.MAX_VALUE;    
	        for (int i=0; i<vector.length; i++) {
	        	if (isPrime(vector[i]) && ((i+1)%2==0) && (result>vector[i])) {
	        		result = vector[i];
	        	}
	        }
	            
	        if (result != null) {
	            System.out.println(result > 0 ? result : "NULL");
	        }
	    }
	}

