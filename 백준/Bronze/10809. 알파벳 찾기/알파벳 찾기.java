import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char [] word = br.readLine().toCharArray();
		
		for(int i=0; i<26; i++) {
			int state = -1;
			
			for(int j=0; j<word.length; j++) {
				if(word[j]-'a' == i) {
					state = j;
					break;
				}
			}
			System.out.print(state + " ");
		}

	}

}