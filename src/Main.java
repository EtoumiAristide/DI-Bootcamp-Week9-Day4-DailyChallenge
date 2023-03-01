import javax.swing.text.DateFormatter;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalField;

public class Main {
    public static void main(String[] args) {
        /*
            Use the DateTimeFormatter for:
            Print the current date using LocalDate
            Print the current time using LocalDate
            Print the current time and date using LocalDateTime
            Print in a particular format “dd-MM-yyyy HH:mm:ss”
            Print months days and seconds
            Print some specified date “1950,1,26”
            Print date with current time.
        */

        DateTimeFormatter formatterDateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:s");
        DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("HH:mm:s");
        DateTimeFormatter particularFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:s");

        //Current Date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Currente date is: " + currentDate.format(formatterDate));

        //Current Hour
        LocalDate currentHour = LocalDate.now();
        System.out.println("Currente hour is: " + currentDate.atTime(LocalTime.from(LocalDateTime.now())).format(formatterTime));

        //CUrrente date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Currente date time is: " + currentDateTime.format(formatterDateTime));

        //Particular format
        LocalDateTime particulatDateTimeForma = LocalDateTime.now();
        System.out.println("Particular format: " + particulatDateTimeForma.format(particularFormat));

        //Print months days and seconds
        /*for (int i = 0; i < currentDate.getMonth().maxLength(); i++) {
            System.out.println(currentDate.plusDays(i).getDayOfWeek().name());
        }*/
        System.out.println("Months day " + currentDate.getMonth().maxLength() + " and seconds " + currentDateTime.getMonth());

        //Print some specified date “1950,1,26”


        //Print date with current time.
    }
}