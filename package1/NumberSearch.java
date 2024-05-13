package package1;

    import java.util.Scanner;

    public class NumberSearch {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the length of the sequence: ");
            int length = scanner.nextInt();

            int[] numbers = new int[length];

            System.out.println("Enter the numbers:");

            for (int i = 0; i < length; i++) {
                numbers[i] = scanner.nextInt();
            }

            System.out.print("Enter the number to be searched: ");
            int searchNum = scanner.nextInt();

            int count = countNumbers(numbers, searchNum);

            if (count > 0) {
                System.out.println("Number of occurrences: " + count);
            } else {
                System.out.println("The number is not present in the array.");
            }

            scanner.close();
        }

        public static int countNumbers(int[] array, int searchNum) {
            int count = 0;

            for (int num : array) {
                if (num == searchNum) {
                    count++;
                }
            }

            return count;
        }
    }

