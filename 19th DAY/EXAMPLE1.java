import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String formattedDate = date.format(format);

        System.out.println(formattedDate);
    }
}
