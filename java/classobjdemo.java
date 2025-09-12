
public class classobjdemo {
    public static void main(String[] args) {
    
        Student s1 = new Student();
        s1.name = "Alex";
        s1.age = 20;
        s1.displayInfo();
        Student s2 = new Student();
        s2.name = "Ali";
        s2.age = 22;
        s2.displayInfo();
    }
}
class Student {
    String name;
    int age;
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }
}



