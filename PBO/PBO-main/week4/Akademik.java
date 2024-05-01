package week4;

import week1.Mahasiswa;
import java.util.*;

public class Akademik {
    public static void main(String[] args) {
        int n;
        System.out.print("Masukkan Jumlah Data : ");

        try (Scanner inp = new Scanner(System.in)) {
            n = inp.nextInt();
            inp.nextLine(); // Membersihkan newline dari buffer

            Mahasiswa[] mhs = new Mahasiswa[n];

            String nim;
            String nama;
            for (int i = 0; i < n; i++) {
                System.out.println("Data ke-" + (i + 1));
                System.out.print("Masukkan NIM:");
                nim = inp.nextLine();
                System.out.print("Masukkan IPK:");
                inp.nextLine(); // Membersihkan newline dari buffer
                System.out.print("Masukkan Nama:");
                nama = inp.nextLine();

                mhs[i] = new Mahasiswa(nim, nama, i);

            }

            for (int i = 0; i < mhs.length; i++) {
                System.out.println("Data Mahasiswa ke-" + (i + 1));
                System.out.println("Nama: " + mhs[i].getNama());
                System.out.println("NIM: " + mhs[i].getNim());
                System.out.println();
            }
        }
    }
}
