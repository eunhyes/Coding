import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String text = sc.nextLine();
			char [] textArr = text.toCharArray();
			
			if(text.equals("END")){
				break;
			}
			
			for(int i=textArr.length - 1; i >= 0; i--) {
				System.out.print(textArr[i]);
			}
			
			System.out.println();
		}

	}

}