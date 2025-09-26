class HighArrayApp {
    private int[] arr;
    private int nElemen;

    public HighArrayApp(int max) {
        arr = new int[max];
        nElemen = 0;
    }

    public void insert(int value) {
        int i;
        for (i = 0; i < nElemen; i++) {
            if (arr[i] > value) {
                break;
            }
        }

        for (int j = nElemen; j > i; j--) {
            arr[j] = arr[j - 1];
        }

        arr[i] = value;
        nElemen++;
    }

    public int binarySearch(int target) {
        int left = 0;
        int right = nElemen - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public void display() {
        for (int i = 0; i < nElemen; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class main {
    public static void main(String[] args) {
        HighArrayApp arr = new HighArrayApp(10);
        System.out.println("Array sebelum ditambah : ");
        arr.insert(15);
        arr.insert(30);
        arr.insert(45);
        arr.insert(53);
        arr.insert(77);
        arr.insert(79);
        arr.insert(81);

        arr.display();

        System.out.println("\nSetelah ditambah nilai");
        arr.insert(66);
        arr.display();

        int target = 53;
        int hasil = arr.binarySearch(target);
        if (hasil == -1) {
            System.out.println("Data tidak ditemukan");
        } else {
            System.out.println();
            System.out.println(target + " Ditemukan di index ke-" + hasil);
        }

    }
}
