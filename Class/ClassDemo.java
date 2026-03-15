package Class;

// ClassDemo.java
class Mobil {
    // Atribut (fields)
    String merek;
    int tahun;

    // Constructor
    public Mobil(String merek, int tahun) {
        this.merek = merek;
        this.tahun = tahun;
    }

    // Method
    public void tampilkanInfo() {
        System.out.println("Mobil merek: " + merek + ", Tahun: " + tahun);
    }
}

public class ClassDemo {
    public static void main(String[] args) {
        // Membuat object dari class Mobil (demo penggunaan class)
        Mobil mobilSaya = new Mobil("Toyota", 2022);
        mobilSaya.tampilkanInfo();
    }
}