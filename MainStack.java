package PERTEMUAN12.StackDataStatis;

public class MainStack {
    public static void main(String[] args) {
        // Membuat instance dari Stack dengan ukuran default
        Stack stack = new Stack();

        // Menambah elemen ke dalam stack
        System.out.println("Push A: " + stack.push("A"));  // Output: true
        System.out.println("Push B: " + stack.push("B"));  // Output: true
        System.out.println("Push C: " + stack.push("C"));  // Output: true

        // Menampilkan ukuran stack
        System.out.println("Ukuran stack: " + stack.size());  // Output: 3

        // Menghapus elemen dari stack
        System.out.println("Pop: " + stack.pop());  // Output: C
        System.out.println("Pop: " + stack.pop());  // Output: B

        // Menampilkan ukuran stack setelah pop
        System.out.println("Ukuran stack setelah pop: " + stack.size());  // Output: 1

        // Memeriksa apakah stack kosong
        System.out.println("Apakah stack kosong? " + stack.isEmpty());  // Output: false

        // Menghapus elemen terakhir dari stack
        System.out.println("Pop: " + stack.pop());  // Output: A

        // Memeriksa apakah stack kosong setelah semua elemen di-pop
        System.out.println("Apakah stack kosong setelah semua elemen di-pop? " + stack.isEmpty());  // Output: true
    }
}
