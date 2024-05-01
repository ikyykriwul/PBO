package week7;
import week1.Mahasiswa;
public class MainMahasiswa {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("12345", "Budi", "2000-01-01");
        
        // Menggunakan metode getNim(), getNama(), dan getTanggalLahir()
        String nim = mahasiswa1.getNim();
        String nama = mahasiswa1.getNama();
        String tanggal_lahir = mahasiswa1.getTanggalLahir();
        
        // Menampilkan hasil
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + tanggal_lahir);
    }
}