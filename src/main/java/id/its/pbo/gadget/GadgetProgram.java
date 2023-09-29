package id.its.pbo.gadget;

import id.its.pbo.electronics.*;

public class GadgetProgram {
    public static void main (String [] args) {

        Smartphone smartphone1 = new Smartphone("iPhone 15", 2023, "IOS");

        System.out.println (smartphone1.infoSmartphone());
        

    }
}