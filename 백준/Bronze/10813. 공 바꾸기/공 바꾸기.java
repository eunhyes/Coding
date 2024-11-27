import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [] num = new int[n+1];
		// 바구니 번호 = 들어있는 공 번호
		for(int i=1; i<=n; i++) {
			num[i] = i;
		}
		// 교환하기
		for(int i=0; i<m; i++) {
			int bNum1 = sc.nextInt();
			int bNum2 = sc.nextInt();
			// 바구니 2개의 번호 서로 바꾸기
			int temp = num[bNum1];
			num[bNum1] = num[bNum2];
			num[bNum2] = temp;
					
		}
		// 출력
		for(int i=1; i<=n; i++) {
			System.out.print(num[i] + " ");
		}
        
	}

}