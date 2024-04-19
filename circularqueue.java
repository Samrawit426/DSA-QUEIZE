public class circularQueue {
    private int[] queueArray;
    private int front;
    private int rear;
    private int maxSize;
    private int currentSize;

    public circularQueue(int capacity) {
        maxSize = capacity;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue item: " + item);
            return;
        }

        rear = (rear + 1) % maxSize;
        queueArray[rear] = item;
        currentSize++;
        System.out.println("Enqueued item: " + item);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue item.");
            return -1; // or throw an exception
        }

        int dequeuedItem = queueArray[front];
        front = (front + 1) % maxSize;
        currentSize--;
        System.out.println("Dequeued item: " + dequeuedItem);
        return dequeuedItem;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek item.");
            return -1; // or throw an exception
        }

        return queueArray[front];
    }

    public int size() {
        return currentSize;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue (front to rear): ");
        for (int i = 0; i < currentSize; i++) {
            int index = (front + i) % maxSize;
            System.out.print(queueArray[index] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        circularQueue queue = new circularQueue(5);

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
