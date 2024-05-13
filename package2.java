package package2;

public class package2 {
    

    public class Package2 {
        private int maxSize;
        private int[] stackArray;
        private int top;

        public Package2(int size) {
            maxSize = size;
            stackArray = new int[maxSize];
            top = -1;
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == maxSize - 1;
        }

        public void push(int value) {
            if (isFull()) {
                System.out.println("Stack is full. Cannot push element: " + value);
                return;
            }
            stackArray[++top] = value;
            System.out.println("Pushed element: " + value);
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty. Cannot pop element.");
                return -1;
            }
            int element = stackArray[top--];
            System.out.println("Popped element: " + element);
            return element;
        }

        public static void main(String[] args) {
            Package2 stack = new Package2(5);
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.pop();
            stack.push(4);
            stack.pop();
            stack.pop();
            stack.pop();
        }
    }
}
