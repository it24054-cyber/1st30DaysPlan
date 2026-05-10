import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        for (String item : list) {
            System.out.println(item);
        }
    }
}
