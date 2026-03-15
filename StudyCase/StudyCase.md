# Study Case: Sistem Manajemen Perpustakaan Mini

**Tema**  
Perpustakaan sekolah/kampus kecil yang mengelola berbagai jenis item pinjaman: Buku, Majalah, dan DVD edukasi.

**Tujuan pembelajaran**  
Menggabungkan semua konsep OOP yang sudah dipelajari:  
- Class & Object  
- Encapsulation (data private + getter/setter + validasi)  
- Inheritance (superclass & subclass)  
- Polymorphism (method overriding + runtime polymorphism via reference superclass)

## Struktur Folder yang Diinginkan

```
perpustakaan/
├── item/                          # Inheritance + Polymorphism
│   ├── ItemPerpustakaan.java
│   ├── Buku.java
│   ├── Majalah.java
│   └── DVD.java
├── anggota/                       # Encapsulation
│   └── Anggota.java
└── MainPerpustakaan.java          # Demo penggunaan semua konsep
```
## Spesifikasi Detail

### 1. Class `ItemPerpustakaan` (superclass)

- **Atribut** (protected):
  - `String judul`
  - `int tahunTerbit`
  - `boolean sedangDipinjam` (default = false)

- **Constructor**:
  - Menerima `judul` dan `tahunTerbit`

- **Method**:
  - `void pinjam()`  
    → ubah `sedangDipinjam` menjadi `true` (jika belum dipinjam, jika sudah → cetak pesan "Sudah dipinjam")
  - `void kembalikan()`  
    → ubah `sedangDipinjam` menjadi `false`
  - `abstract double hitungDenda(int hariTerlambat)`  
    → subclass wajib mengimplementasikan
  - `void tampilkanInfo()`  
    → cetak judul, tahun, dan status pinjam (bisa di-override)

### 2. Subclass (Inheritance + Polymorphism)

| Class     | Atribut tambahan       | Denda per hari terlambat | Override `tampilkanInfo()` tambahan |
|-----------|------------------------|---------------------------|--------------------------------------|
| `Buku`    | `String pengarang`     | Rp 2.000                  | Tampilkan pengarang                  |
| `Majalah` | `int edisi`            | Rp 1.000                  | Tampilkan edisi                      |
| `DVD`     | `String sutradara`     | Rp 5.000                  | Tampilkan sutradara                  |

### 3. Class `Anggota` (Encapsulation)

- **Atribut private**:
  - `String nama`
  - `String nim`
  - `int usia`
  - `int jumlahPinjamanSaatIni` (default = 0)

- **Getter** untuk semua atribut

- **Setter**:
  - `setNama(String nama)`
  - `setUsia(int usia)` → jika usia < 15 → cetak pesan error atau throw exception sederhana

- **Method penting**:
  - `boolean bisaPinjam()` → true jika `jumlahPinjamanSaatIni < 3`
  - `void tambahPinjaman()` → jumlahPinjamanSaatIni++
  - `void kurangiPinjaman()` → jumlahPinjamanSaatIni-- (minimal 0)

### 4. Di `MainPerpustakaan.java` (Demo)

Buat simulasi berikut:

1. Buat **minimal 5 item** (campur Buku, Majalah, DVD)  
   Simpan dalam array `ItemPerpustakaan[] koleksi`

2. Buat **2 anggota** perpustakaan

3. Tampilkan daftar semua item beserta statusnya

4. Simulasi proses pinjam:
   - Anggota 1 mencoba pinjam 2 item
   - Anggota 2 mencoba pinjam 3 item (salah satunya gagal karena sudah maksimal)

5. Tampilkan status setelah proses pinjam (polymorphism: panggil `tampilkanInfo()` lewat array superclass)

6. Simulasi pengembalian:
   - Kembalikan 1 item terlambat 7 hari → hitung denda (polymorphism)
   - Tampilkan total denda

7. (Opsional bonus)  
   Tambahkan pesan jika anggota tidak bisa pinjam lagi


