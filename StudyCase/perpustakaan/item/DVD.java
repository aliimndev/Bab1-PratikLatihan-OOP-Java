package StudyCase.perpustakaan.item;

public class DVD extends ItemPerpustakaan {
    private String sutradara;

    public DVD(String judul, int tahunTerbit, String sutradara) {
        super(judul, tahunTerbit);
        this.sutradara = sutradara;
    }

    @Override
    public double hitungDenda(int hariTerlambat) {
        return hariTerlambat * 5000;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("  Sutradara: " + sutradara);
    }
}