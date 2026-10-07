public class BubbleSortUsingFunction {

    // Function to perform Bubble Sort
    static void bubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {

                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Main function
    public static void main(String[] args) {

        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Before Sorting:");

        for (int i : arr) {
            System.out.print(i + " ");
        }

        // Calling Bubble Sort function
        bubbleSort(arr);

        System.out.println("\n\nAfter Sorting:");

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

