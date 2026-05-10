import java.util.HashSet;

public class Example1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(10);
        set.add(5);
        set.add(20);

        for (int num : set) {
            System.out.println(num);
        }
    }
}
