public class throwdemo {
public static void main(String[] args) {
        try {
            checkAge(-5); 
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        try {
            checkAge(18);  
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
    static void checkAge(int age) throws Exception {
        if (age < 0) {
            throw new Exception("Age cannot be negative!");
        } else {
            System.out.println("Age is valid: " + age);
        }
    }
}
