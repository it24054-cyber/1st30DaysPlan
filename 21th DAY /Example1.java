import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String dateString = "2026-05-10";

        LocalDate date = LocalDate.parse(dateString);

        System.out.println(date);
    }
}
