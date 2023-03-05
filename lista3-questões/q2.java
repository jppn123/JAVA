package lista3;
public class q2 {
    public static void main(String[] args) {
    	//váriável de controle
    	int x = 5;
    	
    	//pirâmide do 1 ao x!
        for(int y = 1; y <= x; y++) {
            System.out.print(y);
            for(int i = 2; i <= y; i++) {
                System.out.print(" " + y*i);
            }
            System.out.println();
        }
        /*
        //pirâmide inversa do x! ao 1
		while(x != 0) {	
			for(int i = 1; i <= x; i++) {
				System.out.print(x*i + " ");
			}
			System.out.println();
			x--;
		}*/
        
    }
}


 