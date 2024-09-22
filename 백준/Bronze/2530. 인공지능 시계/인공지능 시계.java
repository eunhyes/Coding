import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		int time = sc.nextInt();
		
		s += time;
		// 초 조건문
		if(s > 59) {
			m += s/60;	// 몫만큼 추가
			s = s%60;	// 나머지 남기기
		} 
		// 분 조건문
		if(m > 59) {
			h += m/60; 
			m = m%60;
		}
		// 시간 조건문
		if(h > 23) {
			h = h%24;
		}

		System.out.println(h + " " + m + " " + s);
	}

}