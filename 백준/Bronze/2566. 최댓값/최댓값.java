import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//int a [] [] = new int[10] [10];
		int max = -1;
		int max_row = 0;
		int max_col = 0;
		
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				int num = sc.nextInt();
				if(num > max) {
					max = num;
					max_row = i;
					max_col = j;
				}
			}
		}
		System.out.println(max);
		System.out.print(max_row + " " + max_col);
	}

}
