import java.util.ArrayList;
import java.util.List;
public class lamdademo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println("Numbers in the list:");
        numbers.forEach(n -> System.out.println(n));
        int sum = numbers.stream().mapToInt(n -> n).sum();
        System.out.println("Sum of numbers: " + sum);
        System.out.println("Numbers greater than 20:");
        numbers.stream()
                .filter(n -> n > 20)
                .forEach(n -> System.out.println(n));
    }
}
