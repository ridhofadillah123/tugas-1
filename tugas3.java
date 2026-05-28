import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {

        // array untuk persentase lembur
        int[] arrayLembur = {30, 32, 34, 36, 38};
        // disini index 0 = 30%, index 1 = 32%, index 2 = 34%, index 3 = 36%, index 4 = 38%

        // array untuk gaji pokok
        long[] arrayGajipokok = {5000000, 6500000, 9500000};
        // disini index 0 = golongan A, index 1 = golongan B, index 2 = golongan C

        Scanner input = new Scanner(System.in);

        // === INPUT ===
        System.out.print("Masukan Nama Karyawan: ");
        String nama = input.next();

        System.out.print("Masukkan golongan (A/B/C): ");
        String golongan = input.next();

        System.out.print("Masukan jam lembur: ");
        int jamLembur = input.nextInt();

        // === PROSES ===
        long gajiPokok;
        int indexGaji;

        if (golongan.equalsIgnoreCase("A")) {
            indexGaji = 0;
        } else if (golongan.equalsIgnoreCase("B")) {
            indexGaji = 1;
        } else if (golongan.equalsIgnoreCase("C")) {
            indexGaji = 2;
        } else {
            System.out.println("Golongan tidak valid!");
            input.close();
            return;
        }

        gajiPokok = arrayGajipokok[indexGaji];

        // === PROSES LEMBUR ===
        int indexLembur;

        if (jamLembur <= 0) {
            indexLembur = -1; // Tidak ada lembur
        } else if (jamLembur == 1) {
            indexLembur = 0;
        } else if (jamLembur == 2) {
            indexLembur = 1;
        } else if (jamLembur == 3) {
            indexLembur = 2;
        } else if (jamLembur == 4) {
            indexLembur = 3;
        } else {
            indexLembur = 4;
        }

        // === HITUNG GAJI LEMBUR ===
        double gajiLembur = 0;
        int persenLembur = 0;

        if (indexLembur >= 0) {
            persenLembur = arrayLembur[indexLembur];
            gajiLembur = gajiPokok * (persenLembur / 100.0);
        }

        double totalGaji = gajiPokok + gajiLembur;

        // === OUTPUT ===
        System.out.println("================================");
        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Golongan      : " + golongan.toUpperCase());
        System.out.println("Gaji Pokok    : Rp " + String.format("%,.0f", (double) gajiPokok));
        System.out.println("Jam Lembur    : " + jamLembur + " Jam");
        System.out.println("Persen Lembur : " + persenLembur + "%");
        System.out.println("Gaji Lembur   : Rp " + String.format("%,.0f", gajiLembur));
        System.out.println("Total Gaji    : Rp " + String.format("%,.0f", totalGaji));
        System.out.println("================================");

        input.close();
    }
}
