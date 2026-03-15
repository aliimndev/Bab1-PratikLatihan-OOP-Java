package Object;

class Mobil {
    String merek;
    int tahun;

    public Mobil(String merek, int tahun) {
        this.merek = merek;
        this.tahun = tahun;
    }

    public void tampilkanInfo() {
        System.out.println("Mobil merek: " + merek + ", Tahun: " + tahun);
    }
}

public class ObjectDemo {
    public static void main(String[] args) {
        // Membuat beberapa object (instance) dari class yang sama
        Mobil mobil1 = new Mobil("Toyota", 2020);
        Mobil mobil2 = new Mobil("Honda", 2021);
        Mobil mobil3 = new Mobil("Suzuki", 2019);

        mobil1.tampilkanInfo();
        mobil2.tampilkanInfo();
        mobil3.tampilkanInfo();

        System.out.println("\nSetiap object memiliki state (data) yang berbeda!");
    }
}