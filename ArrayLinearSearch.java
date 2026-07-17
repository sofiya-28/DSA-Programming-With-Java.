import java.util.Scanner;
public class ArrayLinearSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array
        int[] arr = {10, 25, 30, 45, 50};

        // Input
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        boolean found = false;

        // Linear Search
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }

        sc.close();
    }
}

    