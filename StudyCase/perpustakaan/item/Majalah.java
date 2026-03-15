package StudyCase.perpustakaan.item;

public class Majalah extends ItemPerpustakaan {
    private int edisi;

    public Majalah(String judul, int tahunTerbit, int edisi) {
        super(judul, tahunTerbit);
        this.edisi = edisi;
    }

    @Override
    public double hitungDenda(int hariTerlambat) {
        return hariTerlambat * 1000;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("  Edisi: " + edisi);
    }
}