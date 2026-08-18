import java.time.ZonedDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime time = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println("Tokyo Time: " + time);
    }
}
