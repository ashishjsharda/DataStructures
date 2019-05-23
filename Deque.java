import java.util.Deque;
import java.util.LinkedList;

/**
 * Using Deque
 * @author asharda
 *
 */
public class Dequeue {

    public static void main(String[] args) {

        Deque<String> dq=new LinkedList<String>();
        dq.add("Hello");
        dq.add("World");
        System.out.println("Contents seen are after 1");
        dq.forEach(System.out::println);
        String first=dq.peekFirst();
        System.out.println(first);
        dq.add("test");
        System.out.println("Contents seen are after 2");
        dq.forEach(System.out::println);
        String last=dq.pollLast();
        System.out.println("Contents seen are after 3");
        System.out.println(last);
        System.out.println("Contents seen are after 4");
        dq.forEach(System.out::println);
    }

}
