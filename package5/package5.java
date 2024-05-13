package package5;

public class package5 {
    public class MergeSort {
        public static void mergeSort(int[] arr) {
            if (arr == null || arr.length <= 1) {
                return;
            }
            int n = arr.length;
            int mid = n / 2;
            int[] left = new int[mid];
            int[] right = new int[n - mid];
            System.arraycopy(arr, 0, left, 0, mid);
            System.arraycopy(arr, mid, right, 0, n - mid);
            mergeSort(left);
            mergeSort(right);
            merge(arr, left, right);
        }

        private static void merge(int[] arr, int[] left, int[] right) {
            int i = 0, j = 0, k = 0;
            while (i < left.length && j < right.length) {
                if (left[i] <= right[j]) {
                    arr[k++] = left[i++];
                } else {
                    arr[k++] = right[j++];
                }
            }
            while (i < left.length) {
                arr[k++] = left[i++];
            }
            while (j < right.length) {
                arr[k++] = right[j++];
            }
        }

        public static void main(String[] args) {
            int[] numbers = {5, 2, 8, 1, 3};
            System.out.print("Original array: ");
            printArray(numbers);
            mergeSort(numbers);
            System.out.print("Sorted array: ");
            printArray(numbers);
        }

        public static void printArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
