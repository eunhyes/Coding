import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int [201];
		
		for(int i = 0; i < n; i++) {
			// 배열의 index에는 음수가 올 수 없으므로 +100 -> 양수로 만들기
			int index = sc.nextInt();
			a[index+100]++;
		}
		
		int v = sc.nextInt();
		
		System.out.println(a[v+100]);
	}

}
