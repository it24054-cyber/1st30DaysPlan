class Car{
    private String name ;
    private String color;
    private int model_year;

    Car(String name ,String color, int model_year){
        this.name  = name ;
        this.color = color;
        this.model_year = model_year;
    }

    public void display(){
        System.out.println("Model: " + name );
        System.out.println("Color: " + color);
        System.out.println("Model Year: " + model_year);
    }
}

public class Main{
    public static void main(String[] args){
        Car car1 = new Car("toyota", "red", 1990);

        car1.display();
    }
}
