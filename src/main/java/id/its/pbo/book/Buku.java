package id.its.pbo.book;

public class Buku {
	
	//set variable
	
    private String judul;
    private String pengarang;

    //konstruktor
    public Buku(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }
    
    //getter setter

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
}





