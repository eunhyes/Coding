import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		if(m > 0) {
			for(int i=0; i < n; i++) {
				char [] strArr = sc.next().toCharArray();
				
				for(int j=m-1; j >= 0; j--) {
					System.out.print(strArr[j]);
				}
				System.out.println();
				
			}
		}
	}
}
