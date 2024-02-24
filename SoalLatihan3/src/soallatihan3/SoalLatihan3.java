/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soallatihan3;

import java.util.Scanner;
/**
 *
 * @author A S U S
 */
public class SoalLatihan3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jam Masuk Kendaraan: ");
        int jamMasuk = scanner.nextInt();
        System.out.println("Jam Keluar Kendaraan: ");
        int jamKeluar = scanner.nextInt();

        int lamaParkir = hitungLamaParkir(jamMasuk, jamKeluar);

        int biayaParkir = hitungBiayaParkir(lamaParkir);

        System.out.println("Lama Parkir : " + lamaParkir + " Jam");
        System.out.println("Tarif Parkir : " + biayaParkir);
    }

    public static int hitungLamaParkir(int jamMasuk, int jamKeluar) {
        int lamaParkir;
        if (jamKeluar >= jamMasuk) {
            lamaParkir = jamKeluar - jamMasuk;
        } else {
            lamaParkir = (12 - jamMasuk) + jamKeluar;
        }
        return lamaParkir;
    }

    public static int hitungBiayaParkir(int lamaParkir) {
        int biayaParkir = 1500;
        if (lamaParkir > 2) {
            biayaParkir += (lamaParkir - 2) * 1000;
        }
        return biayaParkir;
    }
}