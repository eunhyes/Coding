import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h1 = sc.nextInt();
		int h2 = sc.nextInt();
		int h3 = sc.nextInt();
		
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();
		
		// 햄버거 종류 중 최소값 구하기
		int h_min = Math.min(h1, Math.min(h2, h3));
		// 음료 종류 중 최소값 구하기
		int b_min = Math.min(b1, b2);
		// 세트메뉴 값 구하기
		int set = (h_min + b_min) - 50;
		
		System.out.println(set);
	}

}
