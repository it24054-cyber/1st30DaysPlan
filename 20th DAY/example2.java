import java.time.ZonedDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime bdTime = ZonedDateTime.now(ZoneId.of("Asia/Dhaka"));
        ZonedDateTime londonTime = ZonedDateTime.now(ZoneId.of("Europe/London"));

        System.out.println("Bangladesh Time: " + bdTime);
        System.out.println("London Time: " + londonTime);
    }
}
