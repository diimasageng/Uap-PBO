/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uap.pbo;

/**
 *
 * @author adiha
 */
public abstract class Sepatu {
    int ukuran;
    int harga;
    String warna;
    String merk;

    public abstract int getUkuran();

    public abstract void setUkuran(int ukuran);

    public abstract int getHarga();
    
    public abstract void setHarga(int harga);

    public abstract String getWarna();

    public abstract void setWarna(String warna);
    
    public abstract String getMerk();

    public abstract void setMerk(String merk);
}
