import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		char num2 [] = sc.next().toCharArray();
		int sum = 0;
		int ten = 1;
		
		for(int i=2; i >= 0; i--) {
			int number = Integer.parseInt(String.valueOf(num2[i]));
			int answer = num1 * number;
			
			sum += answer * ten;
			ten = ten * 10;
			
			System.out.println(answer);
		}
		System.out.println(sum);
	}

}