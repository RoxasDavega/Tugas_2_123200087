/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunRuang;
import bangunDatar.Lingkaran;
/**
 *
 * @author user
 */
public class Tabung extends Lingkaran implements MenghitungRuang{
    private double volume, luaspermukaan, tinggi;

    public Tabung(double tinggi, double jari2) {
        super(jari2);
        this.tinggi = tinggi;
    }
    
    public Tabung(double jari2){ //overload
        super(jari2);
    }
    
    @Override
    public void menghitungVolume() {
        this.volume = (super.getLuas()*this.tinggi);
    } //volume = pi * r^2 * t, luas lingkaran = pi * r^2

    @Override
    public void menghitungLuasPermukaan() {
        this.luaspermukaan = (super.getKeliling()*(super.getJari2()+this.tinggi));
    } // luas permukaan tabung =  2 * phi * r * (r+t), keliling lingkaran = 2 * phi * r 

    public double getVolume() {
        return volume;
    }

    public double getLuaspermukaan() {
        return luaspermukaan;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
}
