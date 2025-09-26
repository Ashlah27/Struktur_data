class Mahasiswa2 {
    private long nim;
    private String nama;
    private String asal;

    public Mahasiswa2(long nim, String nama, String asal) {
        this.nim = nim;
        this.nama = nama;
        this.asal = asal;
    }

    public void displayMhs() {
        System.out.print("\tNIM: " + nim);
        System.out.print(", Nama: " + nama);
        System.out.println(", Asal: " + asal);
    }

    public long getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }
}

class DataArray {
    private Mahasiswa2[] mhs;
    private int nElemen;

    public DataArray(int max) {
        mhs = new Mahasiswa2[max];
        nElemen = 0;
    }

    public void insert(long nim, String nama, String asal) {
        mhs[nElemen] = new Mahasiswa2(nim, nama, asal);
        nElemen++;
    }

    public void bubbleSort() {
        int batas, i;
        for (batas = nElemen - 1; batas > 0; batas--) {
            for (i = 0; i < batas; i++) {
                if (mhs[i].getNim() > mhs[i + 1].getNim()) {
                    swap(i, i + 1);
                }
            }
        }
    }

    private void swap(int one, int two) {
        Mahasiswa2 temp = mhs[one];
        mhs[one] = mhs[two];
        mhs[two] = temp;
    }

    public void insertionSort() {
        int i, curIn;
        for (curIn = 1; curIn < nElemen; curIn++) {
            Mahasiswa2 temp = mhs[curIn];
            i = curIn;
            while (i > 0 && mhs[i - 1].getNim() >= temp.getNim()) {
                mhs[i] = mhs[i - 1];
                i--;
            }
            mhs[i] = temp;
        }
    }

    public void selectionSortByName() {
        int awal, i, min;
        for (awal = 0; awal < nElemen - 1; awal++) {
            min = awal;
            for (i = awal + 1; i < nElemen; i++) {
                if (mhs[i].getNama().compareTo(mhs[min].getNama()) < 0) {
                    min = i;
                }
            }
            swap(awal, min);
        }
    }

    public void displayArray() {
        for (int i = 0; i < nElemen; i++) {
            mhs[i].displayMhs();
        }
    }
}

public class Modul2 {
    public static void main(String[] args) {
        int maxSize = 100;
        DataArray arr = new DataArray(maxSize);

        arr.insert(16650280, "Arina", "Malang");
        arr.insert(16650200, "Jundi", "Malang");
        arr.insert(16650240, "Dinda", "Bandung");
        arr.insert(16650220, "Ismail", "Banyuwangi");
        arr.insert(16650260, "Helmi", "Madura");
        arr.insert(16650230, "Sofi", "Semarang");
        arr.insert(16650250, "Rais", "Ambon");
        arr.insert(16650210, "Ahmad", "Sidoarjo");
        arr.insert(16650270, "Agung", "Madiun");

        System.out.println("Array asli : \n");
        arr.displayArray();

        System.out.println("\nSelectionSortbyName : \n");
        arr.selectionSortByName();
        arr.displayArray();

    }
}

// System.out.println("\nBubble Sort : \n");
// arr.bubbleSort();
// arr.displayArray();

// System.out.println("\nInsertion sort : \n");
// arr.insertionSort();
// arr.displayArray();
