package Inheritance;

class Hewan {
    String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }

    public void makan() {
        System.out.println(nama + " sedang makan.");
    }
}

class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama); // memanggil constructor parent
    }

    public void meong() {
        System.out.println(nama + " berkata: Meong!");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Kucing kucingSaya = new Kucing("Mimi");
        kucingSaya.makan();  // method dari parent (inheritance)
        kucingSaya.meong();  // method sendiri
    }
}