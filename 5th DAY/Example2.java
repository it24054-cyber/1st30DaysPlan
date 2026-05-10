class Vehicle {
    void move() {
        System.out.println("Vehicle moves");
    }
}

class Car extends Vehicle {
    void move() {
        System.out.println("Car drives");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Car();  // parent reference, child object
        v.move();               // calls Car's method
    }
}
