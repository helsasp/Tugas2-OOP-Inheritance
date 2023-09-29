package id.its.pbo.electronics;

import id.its.pbo.gadget.*;
public class Smartphone extends Gadget {

    private String sistemOperasi;
    
    //konstruktor

    public Smartphone (String brand, int tahunRilis, String sistemOperasi) {
        super(brand,tahunRilis);
        this.sistemOperasi = sistemOperasi;
    }
    
    //getter setter

    public String getSistemOperasi (){
        return sistemOperasi;

    }

    public void setSistemOperasi (String sistemOperasi) {
        this.sistemOperasi = sistemOperasi;
    }
    
 //add info sistem operasi
    public String infoSmartphone () {
        return infoGadget() + ", Sistem Operasi: " + sistemOperasi;
    }
}