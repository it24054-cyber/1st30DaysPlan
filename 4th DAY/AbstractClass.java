abstract class Employee{
    String name;

    Employee(String name){
        this.name = name;
    }

    abstract void work();
}

class Teacher extends Employee{
    Teacher(String name){
        super(name);
    }

    @Override
    void work(){
        System.out.println(name + " teaches students");
    }
}

public class AbstractClass{
    public static void main(String[] args){
        Teacher t = new Teacher("Dr. Ziaur Rahman");
        t.work();


    }
}
