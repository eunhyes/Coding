import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		// char 값으로 바꾸기 
		char strChar = str.charAt(0);
		
		// 아스키코드 값으로(int) 형변환
		System.out.println((int)strChar);
		
	}

}