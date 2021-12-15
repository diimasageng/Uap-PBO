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
public class SepatuHandler extends Sepatu{

    public SepatuHandler(String merk, String Warna, int ukuran, int harga) {
        this.setHarga(harga);
        this.setMerk(merk);
        this.setUkuran(ukuran);
        this.setWarna(Warna);
    }
    
    @Override
    public int getUkuran() {
        return ukuran;
    }

    @Override
    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    @Override
    public int getHarga() {
        return harga;
    }

    @Override
    public void setHarga(int harga) {
        this.harga = harga;
    }

    @Override
    public String getWarna() {
        return warna;
    }

    @Override
    public void setWarna(String warna) {
        this.warna = warna;
    }

    @Override
    public String getMerk() {
        return merk;
    }

    @Override
    public void setMerk(String merk) {
        this.merk = merk;
    }
}
