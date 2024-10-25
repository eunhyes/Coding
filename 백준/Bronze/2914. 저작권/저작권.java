import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int i = sc.nextInt();
		// 올림 == 1이라도 클 때 올림
		int result = (a * (i-1)) + 1;
		
		System.out.println(result);
	}

}