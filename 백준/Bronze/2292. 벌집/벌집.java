import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 입력 숫자 
		int sum = 1; // 생기는 총 개수
		int count = 1; // 열 
		
		while(n > sum) {
			
			sum += count * 6;
			count++;
			
		}
		
		System.out.println(count);
	}
}