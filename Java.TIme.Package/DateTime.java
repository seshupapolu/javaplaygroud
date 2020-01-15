import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class DateTime{
	public static void main(String[] args){
		//LocaDate Usage
		LocalDate localDate = LocalDate.now();
		System.out.println(String.format("Current Date : %s\n",localDate));
		
		LocalTime localTime =LocalTime.now();
		System.out.println(String.format("Current Time : %s\n",localTime));
		
		
		LocalDateTime localDateTime =LocalDateTime.now();
		System.out.println(String.format("Current DateTime : %s\n",localDateTime));

	}
}
