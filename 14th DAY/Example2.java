import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        file.createNewFile();

        FileWriter writer = new FileWriter(file);
        writer.write("Hello File");
        writer.close();

        System.out.println("File created and written");
    }
}
