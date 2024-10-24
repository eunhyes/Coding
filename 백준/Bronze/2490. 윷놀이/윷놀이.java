import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			// 배가 나온 개수 (뒤집힌 윷)
			int result = 0;
			
			for(int j=0; j<4; j++) {
				int dbc = sc.nextInt();
				// 윷이 배가 나오면 개수 더해주기
				if(dbc == 0) {
					result++;
				}
			}
			
			switch(result) {
			
				case 0:
					System.out.println("E");
					break;
				case 1:
					System.out.println("A");
					break;
				case 2:
					System.out.println("B");
					break;
				case 3:
					System.out.println("C");
					break;
				case 4:
					System.out.println("D");
					break;
					
			}
			
		}
		
	}

}