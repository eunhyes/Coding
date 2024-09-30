import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int d1 = sc.nextInt();
		int d2 = sc.nextInt();
		double pie = 3.141592;
		double answer = d1*2 + d2*2*pie;
		
		System.out.println(answer);
		
	}

}