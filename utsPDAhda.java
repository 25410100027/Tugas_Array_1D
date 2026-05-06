import java.util.Scanner;
public class utsPDAhda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            /*
            Buatlah program untuk menentukan kelulusan peserta ujian pada sebuah pelatihan
            berdasarkan nilai minimum yang ditetapkan.
            */
        
        //Variabel
        String[] namaPeserta = new String[5];
        int[] nilaiHasil = new int[5];
        int nilaiMinimum = 0;
        int pilihan;

        //Input
        do {
            System.out.println("\nMenghitung Nilai Hasil Ujian");
            System.out.println("1. Input Nama Mahasiswa");
            System.out.println("2. Input Nilai Mahasiswa");
            System.out.println("3. Input Nilai Minimum");
            System.out.println("4. Ketenteuan Lulus atau Tidak");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    for (int i = 1; i <= 5; i++) {
                        sc.nextLine();
                        System.out.print("Nama Peserta ke-" + (i) + ": " );
                    }
                    break;
                
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        sc.nextLine();
                        System.out.print("Nilai Peserta ke" + (i) + ": ");
                    }
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Nilai Minimum : ");
                    nilaiMinimum = sc.nextInt();
                    break;

                case 4:
                    if (nilaiHasil[5] < nilaiMinimum) {
                        System.out.print("Peserta Tidak Lulus");
   
                    } else {
                        System.out.print("Peserta Lulus");
                    }
                
                default:
                    System.out.println("Pilihan invalid!");
                
            }
        } while (pilihan !=4);
        sc.close();
    }
}
