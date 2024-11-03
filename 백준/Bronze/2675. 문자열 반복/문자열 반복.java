import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		// 테스트케이스 개수만큼 돌리는 반복문
		for(int i=0; i<t; i++) {
			st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			char[] text = st.nextToken().toCharArray();
			
			// text의 index를 돌리는 반복문
			for(int j=0; j<text.length; j++) {
				
				// r 번 반복하는 반복문
				for(int k=0; k<r; k++) {
					System.out.print(text[j]);
				}
				
			}
			System.out.println();
		}
		
	}

}