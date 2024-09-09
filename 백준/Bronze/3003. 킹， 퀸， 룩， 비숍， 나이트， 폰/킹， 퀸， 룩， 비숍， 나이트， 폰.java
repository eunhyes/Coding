import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 배열 선언, 초기화값 세팅
		int A[] = {1, 1, 2, 2, 2, 8};
		
		for(int i = 0; i < 6; i++) {
			// i번째에 있는 값 - 입력되는 값 + 공백
			System.out.print(A[i] - sc.nextInt() + " ");
		}

	}

}
