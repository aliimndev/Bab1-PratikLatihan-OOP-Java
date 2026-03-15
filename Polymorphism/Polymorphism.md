# Polymorphism

## Apa itu Polymorphism dalam OOP?
Polimorfisme = "banyak bentuk". Satu method bisa berperilaku berbeda tergantung object yang sebenarnya (runtime polymorphism via overriding).

## Penjelasan Kode
- `Hewan hewan1 = new Anjing();` → Reference tipe parent, tapi object Anjing.
- `hewan1.suara()` → Java menjalankan method yang sesuai dengan object sebenarnya (bukan tipe reference).
- `@Override` → Menandakan method overriding.

Ini adalah salah satu pilar OOP yang paling powerful!

**Cara menjalankan:**
```bash
javac PolymorphismDemo.java
java PolymorphismDemo