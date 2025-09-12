import java.util.ArrayList;
import java.util.List;
public class listdemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple"); 
        System.out.println("Fruits: " + fruits);
        System.out.println("First fruit: " + fruits.get(0));
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);
        System.out.println("Looping through the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("Total fruits: " + fruits.size());
    }
}
