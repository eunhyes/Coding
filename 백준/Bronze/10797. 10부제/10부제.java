import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int day = sc.nextInt();
		int num[] = new int[5];
		int answer = 0;
		
		for(int i=0; i < 5; i++) {
			num[i] = sc.nextInt();
		
			if(day == num[i]) {
				answer++;
			}
		}
		
		System.out.println(answer);
	}

}