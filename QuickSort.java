import java.util.Scanner;
public class QuickSort {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //enter size of array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        
        // create array
        int arr[] = new int[n];

        //enter the element in array
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Quick Sort
        int[] low = new int[n];
        int[] high = new int[n];

        int top = -1;

        low[++top] = 0;
        high[top] = n - 1;

        while (top >= 0) {
            int l = low[top];
            int h = high[top];
            top--;

            int pivot = arr[h];
            int i = l - 1;

            for (int j = l; j < h; j++) {
                if (arr[j] <= pivot) {
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            int temp = arr[i + 1];
            arr[i + 1] = arr[h];
            arr[h] = temp;

            int p = i + 1;

            if (p - 1 > l) {
                low[++top] = l;
                high[top] = p - 1;
            }

            if (p + 1 < h) {
                low[++top] = p + 1;
                high[top] = h;
            }
        }

        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    sc.close();
    }
}
   


