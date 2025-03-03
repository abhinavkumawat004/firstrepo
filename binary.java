import java.util.*;

public class binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array length
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();

        // Input array elements
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array
        Arrays.sort(arr);
        System.out.println("The sorted array is: " + Arrays.toString(arr));

        // Input the value to search
        System.out.println("Enter the value that you want to find: ");
        int key = sc.nextInt();

        // Perform binary search
        int result = Binarysearch(arr, key);

        // Output the result
        if (result == -1) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    public static int Binarysearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        // Binary search loop
        while (low <= high) {
            int mid = low + (high - low) / 2; // Recalculate mid inside the loop

            if (arr[mid] < key) {
                low = mid + 1; // Search in the right half
            } else if (arr[mid] > key) {
                high = mid - 1; // Search in the left half
            } else {
                return mid; // Element found
            }
        }

        return low; // Element not found
    }
}