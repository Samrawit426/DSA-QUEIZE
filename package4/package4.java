package package4;

public class package4 {
    public class BubbleSortAlphabets {
        public static void bubbleSortAlphabets(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                // Last i elements are already in place
                for (int j = 0; j < n - i - 1; j++) {
                    // Swap if the current element is greater than the next element
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

        public static void main(String[] args) {
            int[] alphabets = {'d', 'b', 'a', 'c'};
            System.out.print("Original array: ");
            printArray(alphabets);
            bubbleSortAlphabets(alphabets);
            System.out.print("Sorted array: ");
            printArray(alphabets);
        }

        public static void printArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print((char) arr[i] + " ");
            }
            System.out.println();
        }
    }