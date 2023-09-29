package id.its.pbo.book;

public class BukuPelajaran extends Buku {
	
    private String subjek;

    //konstruktor
    public BukuPelajaran(String judul, String pengarang, String subjek) {
        super(judul, pengarang);
        this.subjek = subjek;
    }

    
    //getter setter 
    public String getSubjek() {
        return subjek;
    }

    public void setSubjek(String subjek) {
        this.subjek = subjek;
    }
}