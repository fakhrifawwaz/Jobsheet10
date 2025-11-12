import java.util.Scanner;

public class SIAKAD15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Deklarasi array 2 dimensi dengan 4 siswa dan 3 mata kuliah
        int[][] nilai = new int[4][3];

        // 2. Input nilai dengan nested loop
        System.out.println("=== Input Nilai Mahasiswa ===");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("  Nilai mata kuliah ke-" + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        // 3. Menampilkan nilai setiap mahasiswa
        System.out.println("\n=== Daftar Nilai Mahasiswa ===");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Mahasiswa ke-" + (i + 1) + ": ");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print(nilai[i][j] + "\t");
            }
            System.out.println();
        }

        // 4. Menghitung rata-rata nilai setiap mahasiswa
        System.out.println("\n=== Rata-rata Nilai Setiap Mahasiswa ===");
        for (int i = 0; i < nilai.length; i++) {
            int total = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                total += nilai[i][j];
            }
            double rataRata = (double) total / nilai[i].length;
            System.out.println("Rata-rata Mahasiswa ke-" + (i + 1) + ": " + rataRata);
        }

        // 5. Menghitung rata-rata nilai setiap mata kuliah
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
