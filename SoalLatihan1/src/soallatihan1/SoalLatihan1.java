/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soallatihan1;

import java.util.Scanner;
/**
 *
 * @author A S U S
 */
public class SoalLatihan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan tiga bilangan bulat:");
        int angka1 = scanner.nextInt();
        int angka2 = scanner.nextInt();
        int angka3 = scanner.nextInt();

        boolean angkaRibuan = cekAngkaRibuan(angka1, angka2, angka3);

        if (angkaRibuan) {
            System.out.println("Ketiga angka tersebut adalah ribuan");
        } else {
            System.out.println("Ketiga angka tersebut bukan ribuan");
        }
    }

    public static boolean cekAngkaRibuan(int angka1, int angka2, int angka3) {
        return (angka1 >= 1000 && angka1 < 10000) &&
               (angka2 >= 1000 && angka2 < 10000) &&
               (angka3 >= 1000 && angka3 < 10000);
    }
}