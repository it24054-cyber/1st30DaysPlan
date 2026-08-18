import java.util.Queue;
import java.util.PriorityQueue;

public class Example2 {
    public static void main(String[] args) {
        Queue<String> q = new PriorityQueue<>();
        q.add("Banana");
        q.add("Apple");
        q.add("Mango");

        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }
}
