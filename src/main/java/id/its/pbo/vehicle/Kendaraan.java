package id.its.pbo.vehicle;

public class Kendaraan {

    private String merk;
    private int tahunProduksi;
    
    //konstruktor

    public Kendaraan (String merk, int tahunProduksi) {
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
    }

    //info
    protected String infoKendaraan () {
        return "Merk: " + merk + ", Tahun: " + tahunProduksi;
    }
    
}


