import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sub_1 [] = new int[4];
		int sub_2 [] = new int[2];
		int sum = 0;
		
		// sub_1 정렬하기
		for(int i=0; i < sub_1.length; i++) {
			sub_1[i] = sc.nextInt();
		}
		Arrays.sort(sub_1);
		
		// sub_2 정렬하기 
		for(int i=0; i < sub_2.length; i++) {
			sub_2[i] = sc.nextInt();
		}
		Arrays.sort(sub_2);
		
		// sum 계산하기
		sum = sub_1[3] + sub_1[2] + sub_1[1] + sub_2[1];
		
		System.out.println(sum);
		
	}

}