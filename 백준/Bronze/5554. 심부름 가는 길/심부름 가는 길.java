import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int y = 0;
		
		for(int i=0; i < 4; i++) {
			y += sc.nextInt();
		}
		
		System.out.println(y/60);
		System.out.println(y%60);
	}

}
