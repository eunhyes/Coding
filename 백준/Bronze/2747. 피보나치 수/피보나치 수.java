import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] p = new int[46];
		
		p[0] = 0;
		p[1] = 1;
		
		for(int i=2; i<=n; i++) {
			p[i] = p[i-1] + p[i-2];
		}
		System.out.println(p[n]);
	}

}