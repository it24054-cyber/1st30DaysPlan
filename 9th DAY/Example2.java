import java.util.LinkedList;

public class Example2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.addFirst("Start");
        list.addLast("End");

        for (String item : list) {
            System.out.println(item);
        }
    }
}
