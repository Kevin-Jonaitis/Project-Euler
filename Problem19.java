import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Problem19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Problem19();
	}
	
	public Problem19() {
		int numOfSundays = 0;
		Calendar start = new GregorianCalendar(1901, 00, 01);
		Calendar end = new GregorianCalendar(2000, 11, 31);
		
		while(!start.equals(end)) {
		start.add(Calendar.DATE, 1);
		if (start.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY && start.get(Calendar.DAY_OF_MONTH) == 1)
			numOfSundays++;
		}
		System.out.println(numOfSundays);
	}
	
}
