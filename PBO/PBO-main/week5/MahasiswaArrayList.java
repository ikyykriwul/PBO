package week5;

import java.util.Scanner;

public class MahasiswaArrayList {

    private String nama;
    private String nim;
    private int sks;
    private int semester;

    public void Mahasiswa(String nama, String nim, int sks, int semester) {
        this.nama = nama;
        this.nim = nim;
        this.sks = sks;
        this.semester = semester;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public int getSks() {
        return sks;
    }

    public int getSemester() {
        return semester;
    }

    public double hitungBiayaKuliah() {
        double biayaPerSks = 750000;
        return sks * biayaPerSks;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Program hitung biaya kuliah mahasiswa ");
            System.out.print("Nama: ");
            String nama1 = scanner.nextLine();
            System.out.print("Nim: ");
            String nim1 = scanner.nextLine();
            System.out.print("Sks: ");
            int sks1 = scanner.nextInt();
            System.out.print("Semester: ");
            int semester1 = scanner.nextInt();

            Mahasiswa mahasiswa1 = new Mahasiswa(nama1, nim1, sks1, semester1);

            System.out.println("Data Mahasiswa :");
            System.out.println("Nama: " + mahasiswa1.getNama());
            System.out.println("Nim: " + mahasiswa1.getNim());
            System.out.println("Sks: " + mahasiswa1.getSks());
            System.out.println("Semester: " + mahasiswa1.getSemester());

            System.out.println("Biaya mahasiswa : " + mahasiswa1.hitungBiayaKuliah());
        }
    }
}