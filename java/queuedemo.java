import java.util.Queue;
import java.util.LinkedList;

public class queuedemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println("Queue: " + queue);
        int removed = queue.remove();
        System.out.println("Removed element: " + removed);
        System.out.println("Queue after removal: " + queue);
        int front = queue.peek();
        System.out.println("Front element: " + front);
        System.out.println("Looping through queue:");
        for (int num : queue) {
            System.out.println(num);
        }
    }
}
