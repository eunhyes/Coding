import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int do_a = a/c;
		if(a%c != 0) {
			do_a ++;
		}
		
		int do_b = b/d;
		if(b%d != 0) {
			do_b ++;
		}
		
		int answer = Math.max(do_a, do_b);
		
		System.out.println(l - answer);
	}

}
