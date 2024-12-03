import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int a[] = {500, 100, 50, 10, 5, 1};
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int c = 1000 - n;
		int count = 0;
		
		for(int i=0; i<a.length; i++) {
			count += c/a[i];
			c = c%a[i];
		}
		
		System.out.println(count);
	}

}