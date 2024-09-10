import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 1-30번의 학생들 -> 0번은 안 쓰임 -> 31개 필요
		int a[] = new int[31];
		
		// 제출한 학생들의 index에 +1 하는 반복문
		for(int i = 0; i < 28; i++) {
			int num = sc.nextInt();
			a[num]++; 
			// num이 있으면 해당 index에 +1씩
		}
		
		// 제출 안 한 학생들 번호를 출력하는 반복문
		for(int i=1; i <= 30; i++) {
			if(a[i] ==0) {
				System.out.println(i);
			}
		}
		
	}

}
