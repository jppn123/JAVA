package lista3;

public class q3 {
	public static void main(String[] args) {
		
		int x = 5;
		for(int i = x; i!=1; i--) {
			System.out.print(i + "x");
		}
		System.out.println(1 + " = " + fat(x));
		
	}
	
	public static int fat(int n) {
		if(n == 1 || n == 0) {
			return 1;
		} else {
			return n * fat(n-1);
		}
	}
	
}
