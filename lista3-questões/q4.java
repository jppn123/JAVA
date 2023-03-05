package lista3;
import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
    	try (Scanner sc = new Scanner(System.in)) {
    		
			System.out.println("digite o valor limite: ");
			int valLimite = sc.nextInt();
			System.out.println("sequência de fibonacci menor do que " + valLimite + ":");
			
			for(int i = 1; i < valLimite; i++) {
				if(fibonacci(i) < valLimite) {
					System.out.print(fibonacci(i) + " ");
				}
			}
		}
    }
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } 
        else if(n == 1) {
        	return 1;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}

