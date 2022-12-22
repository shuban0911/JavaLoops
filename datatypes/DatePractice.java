package datatypes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePractice {

	public static void main(String[] args) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
			String date = sdf.format(new Date());
			System.out.println(date);
		
	}

}
