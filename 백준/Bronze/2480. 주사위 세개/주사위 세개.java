import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a == b && b == c) {
			System.out.println(10000 + (a * 1000));
		} else if(a==b || b==c || c==a) {
			if(a==b || c==a) {
				System.out.println(1000 + (a * 100));
			} else {
				System.out.println(1000 + (b * 100));
			}
		} else {
			int maxNum = Math.max(a, Math.max(b, c));
			System.out.println(maxNum * 100);
		}
	}

}