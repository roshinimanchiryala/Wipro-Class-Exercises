import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class datedemo{
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Current Date: " + date);
        LocalTime time = LocalTime.now();
        System.out.println("Current Time: " + time);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + dateTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);
        LocalDate nextWeek = date.plusDays(7);
        LocalDate nextMonth = date.plusMonths(1);
        LocalDate nextYear = date.plusYears(1);
        System.out.println("Next Week: " + nextWeek);
        System.out.println("Next Month: " + nextMonth);
        System.out.println("Next Year: " + nextYear);
        LocalDate lastWeek = date.minusDays(7);
        System.out.println("Last Week: " + lastWeek);
    }
}

