public class QuickSort {
    
    static int partition(long[] arr, int low, int high) {
        long pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                long temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        long temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    static void quickSort(long[] arr, int low, int high) {
        if (low < high) {
            // pi is partitioning index, arr[pi] is now at right place
            int pi = partition(arr, low, high);

            // Recursively sort elements before partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        long[] arr = {240605110008L, 240605110002L, 240605110005L, 240605110001L, 240605110004L, 240605110003L};
         //long[] arr = {64L, 34L, 25L, 12L, 22L, 11L, 90L};
         System.out.println("Given Array");
         printArray(arr);
        int n = arr.length;

        quickSort(arr, 0, n - 1);
        System.out.println("Sorted array");
        printArray(arr);
    }

    static void printArray(long[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
