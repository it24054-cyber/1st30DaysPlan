import java.util.HashMap;

public class Example2 {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Raiyyan", 85);
        marks.put("Tafsir", 90);
        marks.put("Mashrafee", 88);

        for (String name : marks.keySet()) {
            System.out.println(name + " " + marks.get(name));
        }
    }
}
