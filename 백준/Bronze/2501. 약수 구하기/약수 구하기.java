import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		int num = 0;
		boolean result = false;
		
		for(int i=1; i<=n; i++) {
			// n의 약수 구하기
			if(n%i == 0) {
				num = i;
				count ++;
			}
			// k번째 약수
			if(count == k) {
				result = true;
				num = i;
				break;
			}
		}
		
		if(result) {
			System.out.print(num);
		} else {
			System.out.print(0);
		}
		
	}

}