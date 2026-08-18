import java.io.File;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) throws Exception {
        File file = new File("test.txt");

        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

        sc.close();
    }
}
