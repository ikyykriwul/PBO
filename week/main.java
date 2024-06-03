
public class main {
  public static void main(String[] args) {

    bangundatar bd = new bangundatar();
    bd.BangunDatar(4,6);
    System.out.println("Panjang : "+bd.getPanjang());
    System.out.println("Lebar : "+bd.getLebar());
    System.out.println("Luas :" +bd.luas(bd.getPanjang(), bd.getLebar()));

        BangunRuang kubus = new BangunRuang();
        double volumeKubus = kubus.volumeKubus(5); // Menghitung volume kubus dengan sisi 5
        System.out.println("Volume kubus: " + volumeKubus);

        BangunRuang balok = new BangunRuang(3, 4, 5);
        double volumeBalok = balok.volumeBalok();
        System.out.println("Volume balok: " + volumeBalok);

        BangunRuang tabung = new BangunRuang(2);
        tabung.setTinggi(10);
        double volumeTabung = tabung.volumeTabung();
        System.out.println("Volume tabung: " + volumeTabung);
  }
}
