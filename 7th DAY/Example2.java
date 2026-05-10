class Outer {
    static int x = 20;

    static class Inner {
        void show() {
            System.out.println(x);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer.Inner i = new Outer.Inner();
        i.show();
    }
}
