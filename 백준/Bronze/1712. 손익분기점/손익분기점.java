import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if(b >= c) {
			System.out.println(-1);
		} else {
			// 손익분기점 계산
            int n = a / (c-b) + 1;
			
			System.out.println(n);
		}
		
	}

}