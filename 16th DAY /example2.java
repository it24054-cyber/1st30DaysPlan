import java.io.FileOutputStream;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = new FileOutputStream("output.txt");

        String data = "Hello Java FileOutputStream";
        byte[] arr = data.getBytes();

        out.write(arr);
        out.close();

        System.out.println("Data written to file");
    }
}
