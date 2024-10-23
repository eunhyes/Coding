import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double r = sc.nextInt();
		
		double result1 = Math.PI*r*r;
		double result2 = 2*r*r;
				
		System.out.println(result1);
		System.out.println(result2);
		
	}

}