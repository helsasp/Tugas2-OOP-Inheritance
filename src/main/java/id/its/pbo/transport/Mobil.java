package id.its.pbo.transport;

import id.its.pbo.vehicle.Kendaraan;

public class Mobil extends Kendaraan {
    private String jenis;

    //konstruktor
    public Mobil (String merk, int tahunProduksi, String jenis) {
        super(merk,tahunProduksi);
        this.jenis = jenis;
    }

    public String getJenis () {
        return jenis;
    }

    //getter setter
    public void setJenis (String jenis) {
        this.jenis = jenis;
    }

    //add info jenis
    public String infoMobil () {
        return infoKendaraan() + (", Jenis: "+jenis);
    }
}