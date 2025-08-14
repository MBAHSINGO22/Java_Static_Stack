
# 📝 Java Static Stack

## 📖 Deskripsi Proyek
Proyek Java yang mengimplementasikan struktur data **stack statis** menggunakan array.  
Proyek ini mencakup:

- 📊 **Stack.java**: Kelas yang mendefinisikan stack dengan metode `push` untuk menambahkan elemen, `pop` untuk menghapus elemen teratas, `size` untuk mendapatkan ukuran, dan `isEmpty` untuk mengecek kondisi kosong.
- 🔍 **MainStack.java**: Kelas utama yang menguji fungsionalitas stack dengan menambahkan elemen ("A", "B", "C"), menghapus elemen, dan menampilkan ukuran serta status stack.

---

## 🧠 Teknologi
- Java

---

## 📂 Struktur File
```
Java_Static_Stack/
├── src/PERTEMUAN12/StackDataStatis/
├── Stack.java               # 📊 Implementasi kelas stack
├── MainStack.java           # 🔍 Skrip utama untuk pengujian stack
```

---

## 🟢 Catatan
- Stack menggunakan **array statis** dengan ukuran default **10**; jika penuh, operasi `push` akan gagal.
- Metode `pop` mengembalikan `null` jika stack kosong.

---

## 📈 Contoh Output
**MainStack.java**
```
Push A: true
Push B: true
Push C: true
Ukuran stack: 3
Pop: C
Pop: B
Ukuran stack setelah pop: 1
Apakah stack kosong? false
Pop: A
Apakah stack kosong setelah semua elemen di-pop? true
```

---

## 👨‍💻 Pengembang
**MBAHSINGO22**  
🔗 GitHub
