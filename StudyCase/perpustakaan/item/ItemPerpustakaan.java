package StudyCase.perpustakaan.item;


public abstract class ItemPerpustakaan {
    protected String judul;
    protected int tahunTerbit;
    protected boolean sedangDipinjam;

    public ItemPerpustakaan(String judul, int tahunTerbit) {
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.sedangDipinjam = false;
    }

    public void pinjam() {
        if (sedangDipinjam) {
            System.out.println("Item \"" + judul + "\" sedang dipinjam oleh orang lain.");
        } else {
            sedangDipinjam = true;
            System.out.println("Item \"" + judul + "\" berhasil dipinjam.");
        }
    }

    public void kembalikan() {
        if (!sedangDipinjam) {
            System.out.println("Item \"" + judul + "\" belum dipinjam.");
        } else {
            sedangDipinjam = false;
            System.out.println("Item \"" + judul + "\" telah dikembalikan.");
        }
    }

    // Method abstract → subclass wajib implement
    public abstract double hitungDenda(int hariTerlambat);

    public void tampilkanInfo() {
        System.out.printf("Judul: %s | Tahun: %d | Status: %s%n",
                judul, tahunTerbit, sedangDipinjam ? "Dipinjam" : "Tersedia");
    }

    // Getter agar subclass bisa akses jika perlu
    public String getJudul() {
        return judul;
    }

    public boolean isSedangDipinjam() {
        return sedangDipinjam;
    }
}