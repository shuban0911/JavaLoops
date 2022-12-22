import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class CalendarDemo {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));

		System.out.println(new SimpleDateFormat("EEEE", Locale.ENGLISH).format(cal.getTime()));
	}

}
