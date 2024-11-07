import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		String reA = new StringBuilder(a).reverse().toString();
		String reB = new StringBuilder(b).reverse().toString();
		
		int numA = Integer.parseInt(reA);
		int numB = Integer.parseInt(reB);
	
		System.out.println(Math.max(numA, numB));
	}

}