import java.util.Scanner;
public class tugasArrayDimensi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Soal cerita
        Buatlah program seperti dibawah ini:
        Pemesanan Tiket Surabaya Zoo
        1.	Input Kategori dan Harga
        2.	Input Jumlah Beli
        3.	Lihat Total Bayar
        4.	Keluar Program
        
        Pada menu 1. input data, terdiri atas kategori dan Harga dengan isian bebas dari admin menggunakan array 1 dimensi.

        Kemudian pada menu 2, mengisi jumlah tiket yang dibeli sesuai kategori dan Harga pada menu 1.

        Pada menu 3, dilakukan total bayar dari jumlah tiket yang dibeli (sekaligus print total bayar)
        */
        
        //Variabel
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
            pilihan = sc.nextInt();

            switch (pilihan) {
                //Program 1
                case 1:
                    System.out.println("");
                    System.out.print("Masukkan jumlah kategori: ");
                    jumlahKategori = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < jumlahKategori; i++) {
                        System.out.print("Kategori ke-" + (i + 1) + ": ");
                        kategori[i] = sc.nextLine();

                        System.out.print("Harga tiket: ");
                        harga[i] = sc.nextInt();
                        sc.nextLine();
                    }
                    break;

                //Program 2
                case 2:
                    if (jumlahKategori == 0) {
                        System.out.println("Silakan input kategori ");
                        break;
                    }

                    System.out.println("\nDaftar Kategori:");
                    for (int i = 0; i < jumlahKategori; i++) {
                        System.out.println((i + 1) + ". " + kategori[i] + " - Rp" + harga[i]);
                    }

                    System.out.print("Pilih kategori (nomor): ");
                    int pilihKategori = sc.nextInt();

                    System.out.print("Jumlah tiket: ");
                    int jumlahBeli = sc.nextInt();

                    totalBayar += harga[pilihKategori - 1] * jumlahBeli;
                    System.out.println("Tiket berhasil ditambahkan!");
                    break;
                    
                //Program 3
                case 3:
                    System.out.println("Total Bayar: Rp" + totalBayar);
                    break;

                //Program 4
                case 4:
                    System.out.println("========== Terima kasih telah membeli tiket ==========");
                    break;

                //Jika input an tidak sesuai dengan pilihan (1-4)
                default:
                    System.out.println("Pilihan invalid!");
            }

        } while (pilihan != 4);

        sc.close();
    }
}
