package week7;

import week1.Mahasiswa;

public class MahasiswaAktif extends Mahasiswa {
    private int usia;
    public int getUsia() {
      return usia;
    }

    public void setUsia(int usia) {
      this.usia = usia;
    }

    private int semester;

    public int getSemester() {
      return semester;
    }

    public void setSemester(int semester) {
      this.semester = semester;
    }

    public MahasiswaAktif(String nim, String nama, String tanggal_lahir, int semester) {
        super(nim, nama, tanggal_lahir);
        this.semester = semester;
    }
}
