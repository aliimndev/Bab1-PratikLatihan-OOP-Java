# Inheritance

## Apa itu Inheritance (Pewarisan) dalam OOP?
Inheritance memungkinkan class anak (child) mewarisi semua atribut dan method dari class induk (parent). Tujuannya: reuse code (tidak menulis ulang).

## Penjelasan Kode
- `class Kucing extends Hewan` → Kucing mewarisi semua dari Hewan.
- `super(nama)` → Memanggil constructor parent.
- `kucingSaya.makan()` → Method `makan()` berasal dari class Hewan (inheritance).
- `kucingSaya.meong()` → Method tambahan milik Kucing saja.

**Cara menjalankan:**
```bash
javac InheritanceDemo.java
java InheritanceDemo