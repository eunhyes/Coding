import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i < 3; i++) {
			
			int start_h = sc.nextInt();
			int start_m = sc.nextInt();
			int start_s = sc.nextInt();
			int end_h = sc.nextInt();
			int end_m = sc.nextInt();
			int end_s = sc.nextInt();
			
			if(end_s < start_s) {
				end_s += 60;
				end_m--;
			}
			
			if(end_m < start_m) {
				end_m += 60;
				end_h--;
			}
			
			int h = end_h - start_h;
			int m = end_m - start_m;
			int s = end_s - start_s;
			
			System.out.println(h + " " + m + " " + s);
		}
		
	}

}