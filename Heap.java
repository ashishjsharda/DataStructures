import java.util.PriorityQueue;

/**
 * Heap using In Built Library Function
 * @author ashish
 */
public class Heap {
    public static void main(String[] args) {
        //By default Min Heap is implemented.
        //To reverse order use Max Heap
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<Integer>();
        priorityQueue.add(10);
        priorityQueue.add(5);
        priorityQueue.add(20);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
    }
}
