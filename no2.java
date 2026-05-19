import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char lanjut = 'y'; // Inisialisasi dengan 'y' agar loop jalan minimal 1 kali
        
        // Mulai do-while loop - program akan minimal jalan 1 kali
        do {
            // Input golongan
            System.out.print("Masukkan golongan (A/B/C): ");
            char golongan = input.next().charAt(0);
            
            // Input jamLembur
            System.out.print("Masukkan jam lembur: ");
            int jamLembur = input.nextInt();
            
            // Declare gajiPokok
            double gajiPokok = 0;
            
            // Switch untuk golongan
            switch (golongan) {
                case 'A':
                    gajiPokok = 5000000;
                    break;
                case 'B':
                    gajiPokok = 6500000;
                    break;
                case 'C':
                    gajiPokok = 9500000;
                    break;
                default:
                    System.out.println("Golongan tidak valid!");
                    continue; // Lompat ke awal loop tanpa menjalankan kode selanjutnya
            }
            
            // Perhitungan gaji lembur
            double gajiLembur = 0;
            if (jamLembur == 1) {
                gajiLembur = gajiPokok * 0.30;
            } else if (jamLembur == 2) {
                gajiLembur = gajiPokok * 0.32;
            } else if (jamLembur == 3) {
                gajiLembur = gajiPokok * 0.34;
            } else if (jamLembur == 4) {
                gajiLembur = gajiPokok * 0.36;
            } else if (jamLembur >= 5) {
                gajiLembur = gajiPokok * 0.38;
            } else {
                gajiLembur = 0;
            }
            
            // Perhitungan jumlah penghasilan
            long jumlahPenghasilan = (long) (gajiPokok + gajiLembur);
            
            // Output
            System.out.println("Jumlah Penghasilan: " + jumlahPenghasilan);
            // Tanya apakah user ingin menghitung lagi
            System.out.print("\nApakah ingin menghitung lagi? (y/n): ");
            lanjut = input.next().charAt(0);
            System.out.println(); // Tambah spasi untuk tampilan lebih rapi
            
        } while (lanjut == 'y' || lanjut == 'Y'); // Loop terus jika jawab 'y' atau 'Y'
        
        // Setelah loop selesai
        System.out.println("Terima kasih!");
        input.close();
    }
}
