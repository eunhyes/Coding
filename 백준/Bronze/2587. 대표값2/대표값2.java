import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int [] num = new int[5];
		int sum = 0;
		
		for(int i=0; i<5; i++) {
			num[i] = sc.nextInt();
			
			sum += num[i];
		}
		// 평균 출력
		int avg = sum/5;
		System.out.println(avg);
		// 중앙값 출력
		Arrays.sort(num);
		System.out.println(num[2]);
	}

}