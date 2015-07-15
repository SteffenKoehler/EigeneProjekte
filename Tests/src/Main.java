import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		String datum = "02.11.2014";
		DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
		Date date = formatter.parse(datum);
		long dateInLong = date.getTime();
		
		System.out.println(dateInLong);
	}

}
