import java.util.Scanner;

public class SIAKAD15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input jumlah siswa dan mata kuliah secara dinamis
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = sc.nextInt();

        // Deklarasi array 2 dimensi 
        int[][] nilai = new int[jumlahSiswa][jumlahMatkul];

        // Input nilai dengan nested loop
        System.out.println("\n=== Input Nilai Mahasiswa ===");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("  Nilai mata kuliah ke-" + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        // Menampilkan nilai setiap mahasiswa
        System.out.println("\n=== Daftar Nilai Mahasiswa ===");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Mahasiswa ke-" + (i + 1) + ": ");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print(nilai[i][j] + "\t");
            }
            System.out.println();
        }

        // Menghitung rata-rata nilai setiap mahasiswa
        System.out.println("\n=== Rata-rata Nilai Setiap Mahasiswa ===");
        for (int i = 0; i < nilai.length; i++) {
            int total = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                total += nilai[i][j];
            }
            double rataRata = (double) total / nilai[i].length;
            System.out.println("Rata-rata Mahasiswa ke-" + (i + 1) + ": " + rataRata);
        }

        // Menghitung rata-rata nilai setiap mata kuliah
        System.out.println("\n=== Rata-rata Nilai Setiap Mata Kuliah ===");
        for (int j = 0; j < nilai[0].length; j++) {
            int total = 0;
            for (int i = 0; i < nilai.length; i++) {
                total += nilai[i][j];
            }
            double rataRataMatkul = (double) total / nilai.length;
            System.out.println("Rata-rata Mata Kuliah ke-" + (j + 1) + ": " + rataRataMatkul);
        }

        sc.close();
    }
}
