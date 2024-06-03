
public class bangundatar {
  private int panjang;
  private int lebar;
  private int diameter;
  private int sisi;
  private static final double pi = 3.14;

  public static double getPi() {
    return pi;
  }
  public int getSisi() {
    return sisi;
  }
  public void setSisi(int sisi) {
    this.sisi = sisi;
  }
  public void BangunDatar(int sisi)
  {
    this.sisi = sisi;
  }
  public void BangunDatar(int panjang, int lebar)
  {
    this.panjang = panjang;
    this.lebar = lebar;
  }
  public int luas(int a)
  {
    return a*a;
  }
  public int luas(int a, int b)
  {
    return a*b;
  }
  public double luas(double a, double b)
  {
    return (a*b)/2; 
  }
  public int getPanjang()
  {
    return panjang;
  }
  public int getLebar()
  {
    return lebar;
  }
  public int getDiameter()
  {
    return diameter;
  }
  
}
