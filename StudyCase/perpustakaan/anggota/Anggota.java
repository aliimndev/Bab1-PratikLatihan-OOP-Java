package StudyCase.perpustakaan.anggota;

public class Anggota {
    private String nama;
    private String nim;
    private int usia;
    private int jumlahPinjamanSaatIni;

    public Anggota(String nama, String nim, int usia) {
        this.nama = nama;
        this.nim = nim;
        setUsia(usia); // validasi usia lewat setter
        this.jumlahPinjamanSaatIni = 0;
    }

    // Getter
    public String getNama() { return nama; }
    public String getNim() { return nim; }
    public int getUsia() { return usia; }
    public int getJumlahPinjamanSaatIni() { return jumlahPinjamanSaatIni; }

    // Setter dengan validasi
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUsia(int usia) {
        if (usia < 15) {
            throw new IllegalArgumentException("Usia minimal harus 15 tahun!");
        }
        this.usia = usia;
    }

    public boolean bisaPinjam() {
        return jumlahPinjamanSaatIni < 3;
    }

    public void tambahPinjaman() {
        if (bisaPinjam()) {
            jumlahPinjamanSaatIni++;
        }
    }

    public void kurangiPinjaman() {
        if (jumlahPinjamanSaatIni > 0) {
            jumlahPinjamanSaatIni--;
        }
    }

    public void tampilkanInfoAnggota() {
        System.out.printf("Anggota: %s (%s) | Usia: %d | Pinjaman saat ini: %d/3%n",
                nama, nim, usia, jumlahPinjamanSaatIni);
    }
}