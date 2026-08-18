import java.util.ArrayList;

class Product {
    int id;
    String name;

    Product(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Example1 {
    public static void main(String[] args) {
        ArrayList<Product> cart = new ArrayList<>();

        cart.add(new Product(1, "Laptop"));
        cart.add(new Product(2, "Mouse"));
        cart.add(new Product(3, "Keyboard"));

        for (Product p : cart) {
            System.out.println(p.id + " " + p.name);
        }
    }
}
