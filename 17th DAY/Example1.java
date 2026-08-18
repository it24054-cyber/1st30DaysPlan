import java.io.File;

public class Main {
    public static void main(String[] args) {
        File dir = new File("MyFolder");

        if (dir.mkdir()) {
            System.out.println("Directory created");
        } else {
            System.out.println("Directory already exists");
        }
    }
}
