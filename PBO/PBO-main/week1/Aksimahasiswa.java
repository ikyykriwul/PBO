package week1;

 public class Aksimahasiswa {
    public static void main(String[] args) {
        // Membuat objek mhs1 dari kelas Mahasiswa
       Mahasiswa mhs1 = new Mahasiswa(null, null, 0);
        mhs1.nim = "A11.2000.0000";
        mhs1.nama = "Harkespan";
        mhs1.usia = 22;

        // Memanggil metode untuk menampilkan identitas dan aktivitas belajar mahasiswa
        mhs1.getIdentitas();
        mhs1.belajar();
    }
}

    