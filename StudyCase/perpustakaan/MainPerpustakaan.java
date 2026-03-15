package StudyCase.perpustakaan;

import StudyCase.perpustakaan.item.*;
import StudyCase.perpustakaan.anggota.Anggota;
import java.util.Scanner;

public class MainPerpustakaan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Koleksi item (polymorphism)
        ItemPerpustakaan[] koleksi = new ItemPerpustakaan[] {
            new Buku("Pemrograman Java", 2022, "Budi Santoso"),
            new Buku("Algoritma & Struktur Data", 2020, "Andi Nugroho"),
            new Majalah("National Geographic Indonesia", 2025, 142),
            new Majalah("Tempo", 2026, 15),
            new DVD("Matematika untuk SMA", 2023, "Dr. Siti Aminah"),
            new DVD("Kimia Dasar", 2021, "Prof. Rahman")
        };

        // 2 anggota
        Anggota[] anggotaList = new Anggota[] {
            new Anggota("Rina Susanti", "A12.2023.001", 19),
            new Anggota("Bima Pratama", "A12.2024.045", 17)
        };

        System.out.println("=====================================");
        System.out.println("  SISTEM MANAJEMEN PERPUSTAKAAN MINI  ");
        System.out.println("=====================================");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan semua item");
            System.out.println("2. Tampilkan info anggota");
            System.out.println("3. Pinjam item");
            System.out.println("4. Kembalikan item + hitung denda");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (0-4): ");

            int pilihan = -1;
            try {
                pilihan = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Input harus angka!");
                continue;
            }

            if (pilihan == 0) {
                System.out.println("Terima kasih telah menggunakan sistem ini. Sampai jumpa!");
                break;
            }

            switch (pilihan) {
                case 1 -> tampilkanSemuaItem(koleksi);
                case 2 -> tampilkanSemuaAnggota(anggotaList);
                case 3 -> prosesPinjam(scanner, koleksi, anggotaList);
                case 4 -> prosesKembali(scanner, koleksi);
                default -> System.out.println("Pilihan tidak valid!");
            }
        }

        scanner.close();
    }

    private static void tampilkanSemuaItem(ItemPerpustakaan[] koleksi) {
        System.out.println("\n=== DAFTAR KOLEKSI PERPUSTAKAAN ===");
        for (int i = 0; i < koleksi.length; i++) {
            System.out.printf("%d. ", (i + 1));
            koleksi[i].tampilkanInfo();
            System.out.println("-----------------------------");
        }
    }

    private static void tampilkanSemuaAnggota(Anggota[] anggotaList) {
        System.out.println("\n=== DAFTAR ANGGOTA ===");
        for (int i = 0; i < anggotaList.length; i++) {
            System.out.printf("%d. ", (i + 1));
            anggotaList[i].tampilkanInfoAnggota();
        }
    }

    private static void prosesPinjam(Scanner scanner, ItemPerpustakaan[] koleksi, Anggota[] anggotaList) {
        tampilkanSemuaAnggota(anggotaList);
        System.out.print("Pilih nomor anggota (1-" + anggotaList.length + "): ");
        int nomorAnggota = Integer.parseInt(scanner.nextLine().trim()) - 1;

        if (nomorAnggota < 0 || nomorAnggota >= anggotaList.length) {
            System.out.println("Anggota tidak ditemukan!");
            return;
        }

        Anggota anggota = anggotaList[nomorAnggota];

        if (!anggota.bisaPinjam()) {
            System.out.println("Maaf, " + anggota.getNama() + " sudah mencapai batas maksimal 3 pinjaman!");
            return;
        }

        tampilkanSemuaItem(koleksi);
        System.out.print("Pilih nomor item yang ingin dipinjam (1-" + koleksi.length + "): ");
        int nomorItem = Integer.parseInt(scanner.nextLine().trim()) - 1;

        if (nomorItem < 0 || nomorItem >= koleksi.length) {
            System.out.println("Item tidak ditemukan!");
            return;
        }

        ItemPerpustakaan item = koleksi[nomorItem];

        if (item.isSedangDipinjam()) {
            System.out.println("Item \"" + item.getJudul() + "\" sedang dipinjam orang lain.");
            return;
        }

        item.pinjam();
        anggota.tambahPinjaman();
        System.out.println("Peminjaman berhasil untuk " + anggota.getNama() + "!");
    }

    private static void prosesKembali(Scanner scanner, ItemPerpustakaan[] koleksi) {
        tampilkanSemuaItem(koleksi);

        System.out.print("Pilih nomor item yang ingin dikembalikan (1-" + koleksi.length + "): ");
        int nomorItem = Integer.parseInt(scanner.nextLine().trim()) - 1;

        if (nomorItem < 0 || nomorItem >= koleksi.length) {
            System.out.println("Item tidak ditemukan!");
            return;
        }

        ItemPerpustakaan item = koleksi[nomorItem];

        if (!item.isSedangDipinjam()) {
            System.out.println("Item \"" + item.getJudul() + "\" belum dipinjam.");
            return;
        }

        System.out.print("Berapa hari terlambat? (0 jika tepat waktu): ");
        int hariTerlambat = Integer.parseInt(scanner.nextLine().trim());

        item.kembalikan();

        if (hariTerlambat > 0) {
            double denda = item.hitungDenda(hariTerlambat);
            System.out.printf("Denda keterlambatan: Rp %,.0f (Rp %,.0f/hari × %d hari)%n",
                    denda, item.hitungDenda(1), hariTerlambat);
        } else {
            System.out.println("Pengembalian tepat waktu. Tidak ada denda.");
        }
    }
}