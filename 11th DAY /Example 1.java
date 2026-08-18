import java.util.Queue;
import java.util.LinkedList;

public class Example1 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);

        q.poll();

        for (int num : q) {
            System.out.println(num);
        }
    }
}
