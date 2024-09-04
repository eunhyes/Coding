import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) { // N에대한 반복
			
			for(int j = 0; j <= i; j++) { // i에 대한 반복 
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}