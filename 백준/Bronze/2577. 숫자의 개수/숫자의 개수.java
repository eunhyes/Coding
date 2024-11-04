import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int num = a*b*c;
		// 배열로 바꿔주기
		char [] numArr = Integer.toString(num).toCharArray();
		int [] count = new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			int temp = Integer.parseInt(String.valueOf(numArr[i]));
			// temp = num의 각 자리 숫자
			count[temp]++;
		}
		
		for(int i=0; i<10; i++) {
			System.out.println(count[i]);
		}
		
	}
	
}
