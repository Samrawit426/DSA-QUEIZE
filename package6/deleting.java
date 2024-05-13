package package6;

public class deleting {

        public static int[] deleteElement(int[] array, int index) {
            if (index < 0 || index >= array.length) {
                System.out.println("Invalid index.");
                return array;
            }

            int[] modifiedArray = new int[array.length - 1];
            int modifiedIndex = 0;

            for (int i = 0; i < array.length; i++) {
                if (i != index) {
                    modifiedArray[modifiedIndex] = array[i];
                    modifiedIndex++;
                }
            }

            return modifiedArray;
        }

        public static void main(String[] args) {
            int[] array = {3, 7, 1, 9, 4};
            int index = 2;
            System.out.println("Original array: " + Arrays.toString(array));
            int[] modifiedArray = deleteElement(array, index);
            System.out.println("Modified array: " + Arrays.toString(modifiedArray));
        }
    }

