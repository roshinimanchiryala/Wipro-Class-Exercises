public class constructordemo {
    public static void main(String[] args) {
        Student s1 = new Student("Alex", 20);
        Student s2 = new Student("Ali", 22);
        s1.displayInfo();
        s2.displayInfo();
    }
}

class Student {
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
}
}