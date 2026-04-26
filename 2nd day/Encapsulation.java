
class Student{
    private String name;

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}

public class Encapsulation{
    public static void main(String[] args){
        Student s1 = new Student();

        s1.setName("Ishtiak");
        System.out.println(s1.getName());
    }
}
