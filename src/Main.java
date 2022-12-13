import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        //DayNumber FullMonthName Last2DigitsOfYearNumber HourTime MinuteTime
        LocalDateTime time = LocalDateTime.now();
        ZonedDateTime zonetime = ZonedDateTime.now();

        int dayNumer = time.getDayOfMonth();
        Month monthName = time.getMonth();
        int year2Number = Year.now().getValue()%100;
        int hourNumber = time.getHour();
        int minuteTime = time.getMinute();

        System.out.println(
                "Day: "+dayNumer+
                " Month: "+monthName+
                " Year: "+year2Number+
                " Hours: "+hourNumber+
                " Minute: "+minuteTime);

        System.out.println(zonetime.toString());
    }

}