public class shellSortNama {
    
    static void shellSort(String[] arr) {
        int n = arr.length;

        // Start with a big gap, then reduce the gap
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Do a gapped insertion sort for this gap size.
            for (int i = gap; i < n; i++) {
                // add arr[i] to the elements that have been gap sorted
                String temp = arr[i];

                // shift earlier gap-sorted elements up until the correct location for arr[i] is found
                int j;
                for (j = i; j >= gap && arr[j - gap].compareTo(temp) > 0; j -= gap) {
                    arr[j] = arr[j - gap];
                }

                // put temp (the original arr[i]) in its correct location
                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        String[] arr = {"Charlie", "Alice", "Eve", "Bob", "David"};
        shellSort(arr);
        System.out.println("Sorted array");
        printArray(arr);
    }

    static void printArray(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
