package package3;

    public class package3 {
        private int maxSize;
        private int[] stack1;
        private int[] stack2;
        private int top1;
        private int top2;

        public (int size) {
            maxSize = size;
            stack1 = new int[maxSize];
            stack2 = new int[maxSize];
            top1 = -1;
            top2 = -1;
        }

        public void enqueue(int value) {
            if (isFull()) {
                System.out.println("Queue is full. Cannot enqueue element " + value);
                return;
            }
            transferStack1ToStack2();
            stack1[++top1] = value;
            transferStack2ToStack1();
            System.out.println("Enqueued element: " + value);
        }

        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty. Cannot dequeue element.");
                return -1;
            }
            return stack2[top2--];
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty. Cannot peek element.");
                return -1;
            }
            return stack2[top2];
        }

        public boolean isEmpty() {
            return top1 == -1 && top2 == -1;
        }

        public boolean isFull() {
            return top1 == maxSize - 1;
        }

        private void transferStack1ToStack2() {
            while (top1 >= 0) {
                stack2[++top2] = stack1[top1--];
            }
        }

        private void transferStack2ToStack1() {
            while (top2 >= 0) {
                stack1[++top1] = stack2[top2--];
            }
        }

        public static void main(String[] args) {
            Package3 queue = new Package3(5);

            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);

            System.out.println("Peeked element: " + queue.peek());

            System.out.println("Dequeued element: " + queue.dequeue());
            System.out.println("Dequeued element: " + queue.dequeue());

            queue.enqueue(40);
            queue.enqueue(50);
            queue.enqueue(60);  // Trying to enqueue into a full queue

            System.out.println("Peeked element: " + queue.peek());

            System.out.println("Dequeued element: " + queue.dequeue());
            System.out.println("Dequeued element: " + queue.dequeue());
            System.out.println("Dequeued element: " + queue.dequeue());  // Trying to dequeue from an empty queue
        }
    }

