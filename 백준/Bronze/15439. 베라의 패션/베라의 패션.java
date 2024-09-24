import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		// n개의 상의 -> n가지 
		// n개의 하의 -> n-1가지 (상의에서 선택한 색상 제외)
		System.out.println(n * (n-1));
	}

}