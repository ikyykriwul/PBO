public class BangunRuang {
    private int panjang;
    private int lebar;
    private int tinggi;
    private int jariJari;
    private static final double pi = 3.14;

    public BangunRuang() {
        // Konstruktor default
    }

    public BangunRuang(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public BangunRuang(int jariJari) {
        this.jariJari = jariJari;
    }

    public double volumeKubus(int sisi) {
        return sisi * sisi * sisi;
    }

    public double volumeBalok() {
        return panjang * lebar * tinggi;
    }

    public double volumeTabung() {
        return pi * jariJari * jariJari * tinggi;
    }

    // Getter dan Setter untuk panjang, lebar, tinggi, dan jariJari
    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getJariJari() {
        return jariJari;
    }

    public void setJariJari(int jariJari) {
        this.jariJari = jariJari;
    }
}