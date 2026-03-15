# Encapsulation

## Apa itu Encapsulation dalam OOP?
Enkapsulasi = **penyembunyian data**. Data (atribut) dibuat private dan hanya bisa diakses melalui method public (getter & setter). Tujuannya: melindungi data dari perubahan yang tidak sah.

## Penjelasan Kode
- `private String nama;` → Atribut tidak bisa diakses langsung dari luar class.
- `public String getNama()` & `public void setNama()` → Getter & Setter (interface untuk mengakses data).
- Validasi di setter (`if (umur > 0)`) → Contoh perlindungan data.

**Cara menjalankan:**
```bash
javac EncapsulationDemo.java
java EncapsulationDemo