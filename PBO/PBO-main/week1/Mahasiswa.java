package week1;
import java.util.ArrayList;
import java.util.Iterator;
import week5.MataKuliah;

public class  Mahasiswa {

    String nim;
    String nama;
    private String tanggal_lahir;
    private ArrayList<Double> nilai = new ArrayList<Double>();
    private ArrayList<MataKuliah> mk = new ArrayList<MataKuliah>();
    public int usia;
    private int ipk;

    public int getIpk() {
        return ipk;
    }

    public void setIpk(int ipk) {
        this.ipk = ipk;
    }

    public Mahasiswa(String nim, String nama, String tanggal_lahir) {
        this.nim = nim;
        this.nama = nama;
        this.tanggal_lahir = tanggal_lahir;
    }

    public Mahasiswa(String nim, String nama, int ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    public void insertNilai(double n1) {
        nilai.add(n1);
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getTanggalLahir() {
        return tanggal_lahir;
    }
    public void insertMatkul(String nama, String klp, int sks) {
        mk.add(new MataKuliah(nama, klp, sks));
    }

    public void belajar() {
        System.out.println(nama + " belajar");
    }

    public void mainGame() {
        System.out.println(nama + " main game");
    }

    public void getIdentitas() {
        System.out.println("Nama mahasiswa: " + nama);
        System.out.println("NIM mahasiswa: " + nim);
    }

    private void getNilai() {
        Iterator<Double> it = nilai.iterator(); // looping menggunakan iterator
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void getMataKuliah() {
        System.out.println("Daftar Mata Kuliah:");
        for (MataKuliah matkul : mk) {
            System.out.println(matkul.getMatkul() + "-" + matkul.getKelompok() + "-" + matkul.getSks());
        }
    }
}
