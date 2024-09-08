import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			
			String str = sc.nextLine(); // next ->  공백 기준, nextLine -> 줄 기준 
			System.out.println(str);
		}
		
	}

}
