import java.time.*;

public class CurrentDateTime
{
	public static void main(String[] args)
	{
		System.out.println("\t Display The Current Date & Time");
        
		LocalDateTime now = LocalDateTime.now();
		int year = now.getYear();
    	int monthValue = now.getMonthValue();
    	String month = now.getMonth().toString();
		int dayOfMonth = now.getDayOfMonth();
		DayOfWeek dayOfWeek = now.getDayOfWeek();
    	int hour = now.getHour();
    	int minute = now.getMinute();
    	int second = now.getSecond();
        
		System.out.println("Current Date and Time: " + now);
		System.out.println("Year: " + year);
    	System.out.println("Month (Number): " + monthValue);
    	System.out.println("Month: " + month);
		System.out.println("Day of Month: " + dayOfMonth);
		System.out.println("Day of Week: " + dayOfWeek);
		System.out.printf("Time (hh:mm:ss): %02d:%02d:%02d\n", hour, minute, second);
  	}
}
