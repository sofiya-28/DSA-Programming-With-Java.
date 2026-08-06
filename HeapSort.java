import java.util.Scanner;

public class HeapSort {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            int parent = i;

            while (true) {
                int left = 2 * parent + 1;
                int right = 2 * parent + 2;
                int largest = parent;

                if (left < n && arr[left] > arr[largest])
                    largest = left;

                if (right < n && arr[right] > arr[largest])
                    largest = right;

                if (largest != parent) {
                    int temp = arr[parent];
                    arr[parent] = arr[largest];
                    arr[largest] = temp;
                    parent = largest;
                } else {
                    break;
                }
            }
        }

        // Heap Sort
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            int size = i;
            int parent = 0;

            while (true) {
                int left = 2 * parent + 1;
                int right = 2 * parent + 2;
                int largest = parent;

                if (left < size && arr[left] > arr[largest])
                    largest = left;

                if (right < size && arr[right] > arr[largest])
                    largest = right;

                if (largest != parent) {
                    temp = arr[parent];
                    arr[parent] = arr[largest];
                    arr[largest] = temp;
                    parent = largest;
                } else {
                    break;
                }
            }
        }

        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}