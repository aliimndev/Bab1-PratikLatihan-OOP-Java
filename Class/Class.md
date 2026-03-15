# Class

## Apa itu Class dalam OOP?
Class adalah **cetak biru (blueprint)** untuk membuat object. Class mendefinisikan atribut (data) dan method (perilaku) yang akan dimiliki setiap object.

Tanpa class, kita tidak bisa membuat object. Class seperti "resep" untuk membuat mobil, rumah, mahasiswa, dll.

## Penjelasan Kode
- `class Mobil { ... }` → Definisi class (bukan public supaya bisa berada di 1 file).
- `String merek; int tahun;` → Atribut/instance variables.
- `public Mobil(String merek, int tahun)` → Constructor (dipanggil saat `new`).
- `public void tampilkanInfo()` → Method yang bisa dipanggil oleh object.
- `Mobil mobilSaya = new Mobil("Toyota", 2022);` → Membuat object dari class (bagian ini akan dijelaskan lebih detail di folder Object).

**Cara menjalankan:**
```bash
javac ClassDemo.java
java ClassDemo