/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunDatar;

/**
 *
 * @author user
 */
public class Lingkaran implements MenghitungBidang{
    private double jari2, luas, keliling;
    
    public Lingkaran(double jari2) {
        this.jari2 = jari2;
    }
    
    public Lingkaran(){
       
    }
    
    public double getJari2() {
        return jari2;
    }

    public void setJari2(double jari2) {
        this.jari2 = jari2;
    }

    @Override
    public void menghitungLuas() {
        this.luas = (Pi * Math.pow(this.jari2, 2)); //luas = pi * r^2
    }

    @Override
    public void menghitungKeliling() {
        this.keliling = (2 * Pi * this.jari2); //keliling = 2 * pi * r
    }

    public double getLuas() {
        return luas;
    }

    public double getKeliling() {
        return keliling;
    }

    
    
}
