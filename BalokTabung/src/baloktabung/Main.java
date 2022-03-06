/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baloktabung;

import bangunRuang.Balok;
import bangunRuang.Tabung;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Panjang,Lebar,tinggiBalok,tinggiTabung, Jari2;
        int ulang = 1;
        do{
            System.out.println("==========");
            System.out.println("Menu Utama");
            System.out.println("==========");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");
            System.out.print("Pilih : ");
            Scanner input = new Scanner(System.in);
            int pilih = input.nextInt();
            switch(pilih){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.print("Input Panjang: "); Panjang = input.nextDouble();
                    System.out.print("Input Lebar: "); Lebar = input.nextDouble();
                    System.out.print("Input Tinggi: "); tinggiBalok = input.nextDouble();
                    Balok balok = new Balok(tinggiBalok,Panjang,Lebar);
                    balok.menghitungLuas();balok.menghitungKeliling(); balok.menghitungVolume(); balok.menghitungLuasPermukaan();
                    System.out.println("Luas Persegi Panjang= "+ balok.getLuas());
                    System.out.println("Keliling Persegi Panjang= "+balok.getKeliling());
                    System.out.println("Volume Balok= "+balok.getVolume());
                    System.out.println("Luas Permukaan Balok= "+balok.getLuaspermukaan());
                    break;
                case 2:
                    System.out.print("Input Tinggi: "); tinggiTabung = input.nextDouble();
                    System.out.print("Input Jari - jari: "); Jari2 = input.nextDouble();
                    Tabung tabung = new Tabung(tinggiTabung, Jari2);
                    tabung.menghitungLuas(); tabung.menghitungKeliling(); tabung.menghitungLuasPermukaan();tabung.menghitungVolume();
                    System.out.println("Luas Lingkaran= "+tabung.getLuas());
                    System.out.println("Keliling Lingkaran= "+tabung.getKeliling());
                    System.out.println("Volume Tabung= "+tabung.getVolume());
                    System.out.println("Luas Permukaan Tabung= "+tabung.getLuaspermukaan());
                    break;
                default:
                    System.out.println("\nOpsi tidak ada. Mohon masukkan opsi dengan benar!");
                    break;
            }
            System.out.print("Ulangi? (Ya: 1 || Tidak: 0)");
            ulang = input.nextInt();
            
        }while(ulang == 1);
    }
    
}
