package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMethod {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println("queue.element() = " + queue.element());
        System.out.println("queue.remove() = " + queue.remove());
        System.out.println("queue.remove() = " + queue.remove());
        System.out.println("queue.remove() = " + queue.remove());
        System.out.println();

        System.out.println("queue.peek() = " + queue.peek());
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        System.out.println("queue.peek() = " + queue.peek());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
    }
}
