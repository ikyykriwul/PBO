/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectkalkulator;
import java.util.Scanner;
/**
 *
 * @author Rizky Ardiansyah
 */
public class ProjectKalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        double bil1 = scanner.nextDouble();

        System.out.print("Masukkan bilangan kedua: ");
        double bil2 = scanner.nextDouble();

        System.out.print("Pilih operasi (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        double hasil = hitung(bil1, bil2, operator);
        System.out.println("Hasil: " + hasil);
    }
     private static double hitung(double bil1, double bil2, char operator) {
        switch (operator) {
            case '+':
                return bil1 + bil2;
            case '-':
                return bil1 - bil2;
            case '*':
                return bil1 * bil2;
            case '/':
                if (bil2 == 0) {
                    System.out.println("Error: Pembagian dengan nol!");
                    return 0;
                } else {
                    return bil1 / bil2;
                }
            case '%':
                return bil1 % bil2;
            default:
                System.out.println("Operator tidak valid!");
                return 0;
    }
    
   }
}
