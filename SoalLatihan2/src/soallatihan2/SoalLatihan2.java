/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soallatihan2;

import java.util.Scanner;
/**
 *
 * @author A S U S
 */
public class SoalLatihan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan tiga bilangan:");
        int angka1 = scanner.nextInt();
        int angka2 = scanner.nextInt();
        int angka3 = scanner.nextInt();

        int nilaiTerbesar = mencariNilaiTerbesar(angka1, angka2, angka3);
        System.out.println("Nilai terbesar adalah: " + nilaiTerbesar);
    }

    public static int mencariNilaiTerbesar(int angka1, int angka2, int angka3) {
        int nilaiTerbesar = angka1;
        if (angka2 > nilaiTerbesar) {
            nilaiTerbesar = angka2;
        }
        if (angka3 > nilaiTerbesar) {
            nilaiTerbesar = angka3;
        }
        return nilaiTerbesar;
    }
}
