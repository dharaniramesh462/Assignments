import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class exerise047 {

	public static void main(String[] args) {
		SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:ss.SSS");
		cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
		System.out.println("\nNow:"+cdt.format(System.currentTimeMillis()));

	}

}
