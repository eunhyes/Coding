
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();  
        int answer = 0;  
        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            boolean isPrime = true;  
            
            if (num == 1) {  
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(num); j++) {  
                    if (num % j == 0) {  // 나누어떨어지면 소수가 아님
                        isPrime = false;
                        break;
                    }
                }
            }
            
            if (isPrime) {  
                answer++;
            }
        }
        
        System.out.println(answer);
    }
}
