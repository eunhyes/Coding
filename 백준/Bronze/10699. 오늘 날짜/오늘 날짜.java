import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
		
		System.out.println(dateFormat.format(date));
	}

}