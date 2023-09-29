package id.its.pbo.gadget;

public class Gadget {

    private String brand;
    private int tahunRilis;

    //konstruktor
    public Gadget (String brand, int tahunRilis) {
        this.brand = brand;
        this.tahunRilis = tahunRilis;
    }

    public String infoGadget () {
        return("Brand: " + brand + ", Tahun Rilis: "+  tahunRilis);
    }
    
}
