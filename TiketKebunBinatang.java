import java.util.Scanner;

public class TiketKebunBinatang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] kategori = new String[10];
        int[] harga = new int[10];
        int jumlahKategori = 0;

        int pilihan;
        int totalBayar = 0;

        do {
            System.out.println("\n=== Pemesanan Tiket Surabaya Zoo ===");
            System.out.println("1. Input Kategori dan Harga");
            System.out.println("2. Input Jumlah Beli");
            System.out.println("3. Lihat Total Bayar");
            System.out.println("4. Keluar Program");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah kategori: ");
                    jumlahKategori = input.nextInt();
                    input.nextLine(); // buang newline

                    for (int i = 0; i < jumlahKategori; i++) {
                        System.out.print("Kategori ke-" + (i + 1) + ": ");
                        kategori[i] = input.nextLine();

                        System.out.print("Harga tiket: ");
                        harga[i] = input.nextInt();
                        input.nextLine();
                    }
                    break;

                case 2:
                    if (jumlahKategori == 0) {
                        System.out.println("Silakan input kategori terlebih dahulu!");
                        break;
                    }

                    System.out.println("\nDaftar Kategori:");
                    for (int i = 0; i < jumlahKategori; i++) {
                        System.out.println((i + 1) + ". " + kategori[i] + " - Rp" + harga[i]);
                    }

                    System.out.print("Pilih kategori (nomor): ");
                    int pilihKategori = input.nextInt();

                    System.out.print("Jumlah tiket: ");
                    int jumlahBeli = input.nextInt();

                    totalBayar += harga[pilihKategori - 1] * jumlahBeli;
                    System.out.println("Tiket berhasil ditambahkan!");
                    break;

                case 3:
                    System.out.println("Total Bayar: Rp" + totalBayar);
                    break;

                case 4:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 4);

        input.close();
    }
}