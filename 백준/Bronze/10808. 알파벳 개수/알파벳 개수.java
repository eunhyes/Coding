import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// System.out.pritnln((int)'a') -> 아스키코드 값 찍어보기
		int [] s = new int[26];
		char[] str = sc.next().toCharArray();
		
		for(int i=0; i < str.length; i++) {
			// 단어 배열의 index 값을 ++
			s[str[i]-97]++;
		}
		
		for(int i=0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
	}

}
