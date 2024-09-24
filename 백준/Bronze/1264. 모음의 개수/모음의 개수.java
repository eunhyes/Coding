import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String str = sc.nextLine();
			int num = 0;
			char [] strArr = str.toCharArray();
			
			if(str.equals("#")) {
				break;
			}
			
			for(int i=0; i < strArr.length; i++) {
				if(strArr[i] == 'a' || strArr[i] == 'e' || strArr[i] == 'i' || strArr[i] == 'o' || strArr[i] == 'u' ||
					strArr[i] == 'A' || strArr[i] == 'E' || strArr[i] == 'I' || strArr[i] == 'O' || strArr[i] == 'U') {
					num ++;
				}
			}
			
			System.out.println(num);
			
		}

	}

}
