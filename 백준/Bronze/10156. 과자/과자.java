import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int total = k * n;
		int answer = total - m;
		
		if(answer < 0) {
			answer = 0;
		}
		
		System.out.println(answer);
	}

}