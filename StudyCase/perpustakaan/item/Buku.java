package StudyCase.perpustakaan.item;

public class Buku extends ItemPerpustakaan {
    private String pengarang;

    public Buku(String judul, int tahunTerbit, String pengarang) {
        super(judul, tahunTerbit);
        this.pengarang = pengarang;
    }

    @Override
    public double hitungDenda(int hariTerlambat) {
        return hariTerlambat * 2000;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("  Pengarang: " + pengarang);
    }
}