import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int people = 0;
		int max = 0;
		// 역 4개 
		for(int i=0; i<4; i++) {
			
			// 타고 내린 사람 수 입력받
			int out = sc.nextInt();
			int in = sc.nextInt();
			
			people = people + in - out;
			
			if(people > max) {
				max = people;
			}
		}
		
		System.out.println(max);
	}

}