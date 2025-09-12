
public class encapdemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Alex");
        s1.setAge(20);
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}
class Student {

    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0) {  
            this.age = age;
        } else {
            System.out.println("Age must be positive");
        }
    }
}

