import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int max = Integer.MIN_VALUE;
		int index = 1;
		
		for(int i=1; i < 10; i++) {
			int num = sc.nextInt();
			
			if(num > max) {
				max = num;
				index = i;
			}
			
		}
		
		System.out.println(max);
		System.out.println(index);
	}

}