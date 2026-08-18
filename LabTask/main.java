abstract class Vehicle {
    String brand;
    String color;
    String model;

    Vehicle(String brand, String color, String model) {
        System.out.println("Vehicle created: " + brand);
        this.brand = brand;
        this.color = color;
        this.model = model;
    }

    abstract void speed();

    void body() {
        System.out.println("Body: " + color + " " + model);
    }
}

class Car extends Vehicle {
    int horsepower;

    Car(String brand, String color, String model, int horsepower) {
        super(brand, color, model);
        System.out.println("Car created: " + model);
        this.horsepower = horsepower;
    }

    @Override
    void speed() {
        System.out.println(model + " speed: normal, " + horsepower + "hp");
    }

    void color() {
        System.out.println(model + " color: " + color);
    }
}

class SportsCar extends Car {
    int topSpeed;

    SportsCar(String brand, String color, String model, int horsepower, int topSpeed) {
        super(brand, color, model, horsepower);
        System.out.println("SportsCar created: " + model);
        this.topSpeed = topSpeed;
    }

    @Override
    void speed() {
        System.out.println(model + " top speed: " + topSpeed + " kmh, " + horsepower + "hp");
    }

    void model() {
        System.out.println("Model: " + brand + " " + model + ", " + color + ", " + horsepower + "hp, " + topSpeed + "kmh");
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("--- Constructor Chaining ---");
        SportsCar sc = new SportsCar("Porsche", "Silver", "911 Turbo S", 650, 330);

        System.out.println();
        System.out.println("--- Multi-Level Inheritance ---");
        sc.body();
        sc.color();
        sc.speed();
        sc.model();

        System.out.println();
        System.out.println("--- Upcasting ---");
        Vehicle v = new SportsCar("Ferrari", "Red", "SF90", 1000, 340);
        System.out.println();
        v.speed();
        v.body();

        System.out.println();
        System.out.println("--- Downcasting ---");
        if (v instanceof SportsCar) {
            SportsCar sc2 = (SportsCar) v;
            sc2.color();
            sc2.model();
            System.out.println("Downcast successful");
        }

        System.out.println();
        System.out.println("--- Abstract Class ---");
        Car c = new Car("BMW", "White", "M4", 503);
        System.out.println();
        c.speed();
        c.color();
        c.body();
    }
}
