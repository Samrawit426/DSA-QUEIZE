import java.util.Stack;

public class linearQueueUsingStack {
    private Stack<Integer> stack1; // For enqueue operation
    private Stack<Integer> stack2; // For dequeue operation

    public linearQueueUsingStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int item) {
        stack1.push(item);
        System.out.println("Enqueued item: " + item);
    }

    public int dequeue() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue item.");
            return -1; // or throw an exception
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        int dequeuedItem = stack2.pop();
        System.out.println("Dequeued item: " + dequeuedItem);
        return dequeuedItem;
    }

    public int peek() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty. Cannot peek item.");
            return -1; // or throw an exception
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public int size() {
        return stack1.size() + stack2.size();
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue (front to rear): ");
        for (int i = stack2.size() - 1; i >= 0; i--) {
            System.out.print(stack2.get(i) + " ");
        }
        for (int item : stack1) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        linearQueueUsingStack queue = new linearQueueUsingStack();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display(); // Output: Queue (front to rear): 10 20 30

        queue.dequeue();
        queue.display(); // Output: Queue (front to rear): 20 30

        System.out.println("Front item: " + queue.peek()); // Output: Front item: 20
        System.out.println("Queue size: " + queue.size()); // Output: Queue size: 2
        System.out.println("Is queue empty? " + queue.isEmpty()); // Output: Is queue empty? false
    }
}