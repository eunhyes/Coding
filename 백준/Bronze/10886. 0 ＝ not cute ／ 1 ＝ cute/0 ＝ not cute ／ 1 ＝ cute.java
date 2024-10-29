import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cute = 0;
		int not = 0;
		
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			
			if(a == 0) {
				not++;
			} else {
				cute++;
			}
			
		}
		
		if(cute > not) {
			System.out.println("Junhee is cute!");
		} else if(not > cute) {
			System.out.println("Junhee is not cute!");
		}
		
	}

}