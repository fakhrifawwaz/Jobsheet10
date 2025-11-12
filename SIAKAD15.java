import java.util.Scanner;

public class SIAKAD15 {
    public static void main(String[] args) {

        java.util.Scanner sc = new Scanner(System.in);
        
        //memasukkan jumlah siswa dan mata kuliah
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahSiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = sc.nextInt();

        int[][] nilai = new int[jumlahSiswa][jumlahMatkul];

        // Input nilai untuk setiap siswa dan mata kuliah
        System.out.println("\n=== Input Nilai Mahasiswa ===");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print("  Nilai Mata Kuliah ke-" + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        sc.close();
    }
}

