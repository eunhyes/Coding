import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [] num = new int[n+1];
		
		for(int t=0; t<m; t++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			
			for(int index = i; index <= j; index++) {
                // k 값으로 덮어쓰기 (공 새로 넣기)
				num[index] = k;
			}
			
		}
		
		for(int i=1; i<=n; i++) {
			System.out.print(num[i] + " ");
		}
	}

}
