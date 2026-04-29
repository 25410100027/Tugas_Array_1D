import java.util.Scanner;

public class kuisAhda {
    public static void main(String[] args) {
        /*Soal Quiz :
        Program mencatat pasien yang mendaftar dengan batas maksimal 12 orang.
        Setiap pasien yang berhasil didaftarkan akan ditampilkan nomor urutnya.
        Namun, jika pendaftaran ditutup, proses berhenti meskipun belum mencapai 12 orang.
        */
        
        //Deklarasi Scanner
        Scanner sc = new Scanner(System.in);
        
        //Variabel Data
        int nomorUrut = 1;
        String status;
        String namaPasien;
        
        System.out.println("==========Pendaftaran Pasien==========");

        while (nomorUrut <= 12) {
            System.out.println("Pendaftaran pasien nomor urut : 0" + nomorUrut);
            System.out.print("Nama Pasien : ");
            namaPasien = sc.nextLine();

            System.out.print("Lanjutkan? (Y/N) ");
            status = sc.nextLine();

            if (status.equalsIgnoreCase("N")) {
                System.out.println("==========Pendaftaran Ditutup==========");
                break;
            }

            nomorUrut++;
        }

        if (nomorUrut > 12) {
            System.out.println("==========Pendaftaran Penuh==========");
        }

        System.out.println("Selesai. Pasien yang terdaftar : " + nomorUrut);

        sc.close();
    }
}