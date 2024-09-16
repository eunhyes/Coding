import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char[] text = sc.nextLine().toCharArray();
		
		for(int i = 0; i < text.length; i++) {
			char str = text[i];
			if(str >= 'a' && str <= 'z') {
				System.out.print((char)(str-32));
			} else {
				System.out.print((char)(str+32));
			}
			
		}
		
	}

}
