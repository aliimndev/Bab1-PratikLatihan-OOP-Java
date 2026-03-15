package Encapsulation;

class Mahasiswa {
    // Data disembunyikan (private)
    private String nama;
    private int umur;

    // Getter & Setter (akses terkendali)
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        if (umur > 0) {
            this.umur = umur;
        } else {
            System.out.println("Umur tidak boleh negatif!");
        }
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNama("Budi");
        mhs.setUmur(20);

        System.out.println("Nama: " + mhs.getNama());
        System.out.println("Umur: " + mhs.getUmur());

        mhs.setUmur(-5); // akan ditolak
    }
}