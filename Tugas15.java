public class Tugas15 {
    public static void main(String[] args) {
        
        final int RESPONDEN = 10;  // Jumlah responden (baris)
        final int PERTANYAAN = 6;  // Jumlah pertanyaan (kolom)
        
        // Buat array 2D kosong
        double[][] nilai = new double[RESPONDEN][PERTANYAAN];
        
        // === INPUT NILAI SURVEI ===
        System.out.println("=== Input Nilai Survei ===");
        for (int i = 0; i < RESPONDEN; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < PERTANYAAN; j++) {
                System.out.print("Nilai pertanyaan ke-" + (j + 1) + ": ");
                nilai[i][j] = Double.parseDouble(System.console().readLine());  // Input sederhana
            }
            System.out.println();  // Baris kosong
        }
        
        // === HITUNG RATA-RATA PER RESPONDEN ===
        System.out.println("=== Rata-rata per Responden ===");
        for (int i = 0; i < RESPONDEN; i++) {
            double total = 0;
            for (int j = 0; j < PERTANYAAN; j++) {
                total += nilai[i][j];
            }
            double rata = total / PERTANYAAN;
            System.out.println("Rata-rata responden ke-" + (i + 1) + ": " + rata);
        }
        
        // === HITUNG RATA-RATA PER PERTANYAAN ===
        System.out.println("\n=== Rata-rata per Pertanyaan ===");
        for (int j = 0; j < PERTANYAAN; j++) {
            double total = 0;
            for (int i = 0; i < RESPONDEN; i++) {
                total += nilai[i][j];
            }
            double rata = total / RESPONDEN;
            System.out.println("Rata-rata pertanyaan ke-" + (j + 1) + ": " + rata);
        }
    }
}
