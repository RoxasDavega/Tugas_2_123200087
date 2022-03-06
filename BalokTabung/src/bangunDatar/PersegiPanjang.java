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
public class PersegiPanjang implements MenghitungBidang{
    private double panjang,lebar,luas,keliling;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public PersegiPanjang(){
        
    }
    
    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    @Override
    public void menghitungLuas() {
        this.luas = this.panjang*this.lebar; // luas = p * l
    }

    @Override
    public void menghitungKeliling() {
        this.keliling = 2*(this.panjang+this.lebar); // keliling = 2 (p+l)
    }

    public double getLuas() {
        return luas;
    }

    public double getKeliling() {
        return keliling;
    }
}
