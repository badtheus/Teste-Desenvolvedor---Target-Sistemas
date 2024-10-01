	import java.util.Scanner;
	
	public class Questao02 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um número: ");
	        int num = scanner.nextInt();
	        
	        boolean found = false;
	        int a = 0, b = 1;
	        
	        if (num == a || num == b) {
	            found = true;
	        }
	        
	        while (b <= num) {
	            int c = a + b;
	            if (c == num) {
	                found = true;
	                break;
	            }
	            a = b;
	            b = c;
	        }
	        
	        if (found) {
	            System.out.println(num + " pertence à sequência de Fibonacci.");
	        } else {
	            System.out.println(num + " não pertence à sequência de Fibonacci.");
	        }
	        
	        scanner.close();
	    }
	}
