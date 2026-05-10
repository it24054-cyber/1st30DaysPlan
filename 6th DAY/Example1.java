abstract class Animal {
    abstract void sound();

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.sound();
        a.sleep();
    }
}
