package lista3;

public class q1 {
	
    public static void main(String[] args) {
	   	int x = 80, y = 0;
	   	while(x!=1) {
	   		int ternario = ((x%2 == 0)?y = x/2 : (y = 3 * x + 1));
	   		System.out.println(x);
	   		x = y;
	   	}
	   	System.out.println("x: " +x);	
	   	System.out.println("y: " +y);
	 
    }
}