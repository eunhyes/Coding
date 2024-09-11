import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[][] = new int[n][m];
		
		// 입력받은 행렬의 index를 설정하는 반복문
		for(int i=0; i < n; i++) {
			for(int j=0; j < m; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		// 행렬의 index를 더해서 출력하는 반복문
		for(int i=0; i < n; i++) {
			for(int j=0; j < m; j++) {
				a[i][j] += sc.nextInt();
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
}