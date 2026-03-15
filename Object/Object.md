# Object

## Apa itu Object dalam OOP?
Object adalah **instance** (wujud nyata) dari sebuah class. Satu class bisa menghasilkan banyak object, masing-masing memiliki data (state) sendiri.

Class = cetak biru  
Object = mobil yang sudah dibuat dari cetak biru tersebut.

## Penjelasan Kode
- `Mobil mobil1 = new Mobil(...)` → Kata kunci `new` digunakan untuk membuat object.
- `mobil1`, `mobil2`, `mobil3` → 3 object berbeda dari class yang sama.
- Setiap object menyimpan nilai atribut yang berbeda (state berbeda).
- `mobil1.tampilkanInfo()` → Memanggil method yang dimiliki object tersebut.

**Cara menjalankan:**
```bash
javac ObjectDemo.java
java ObjectDemo