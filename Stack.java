package PERTEMUAN12.StackDataStatis;

public class Stack {
    private Object[] elemen;
    private int front;
    private int size;

    // Konstruktor untuk membuat stack dengan ukuran default 10
    public Stack() {
        this(10);
    }

    // Konstruktor untuk membuat stack dengan ukuran tertentu
    public Stack(int ukuran) {
        elemen = new Object[ukuran];
        front = -1;
        size = 0;
    }

    // Metode untuk menambahkan item ke stack
    public boolean push(Object item) {
        // Jika stack penuh, kembalikan false
        if (size == elemen.length) {
            return false;
        }
        // Tambahkan item ke stack dan update front dan size
        elemen[++front] = item;
        size++;
        return true;
    }

    // Metode untuk menghapus item dari stack
    public Object pop() {
        // Jika stack kosong, kembalikan null
        if (isEmpty()) {
            return null;
        }
        // Ambil item dari stack, hapus referensinya, dan update front dan size
        Object item = elemen[front];
        elemen[front--] = null;  // Menghindari memory leak
        size--;
        return item;
    }

    // Metode untuk mengembalikan ukuran stack
    public int size() {
        return size;
    }

    // Metode untuk memeriksa apakah stack kosong
    public boolean isEmpty() {
        return size == 0;
    }
}
