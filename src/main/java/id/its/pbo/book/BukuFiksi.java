package id.its.pbo.book;

public class BukuFiksi extends Buku {
	
    private String genre;
    
    //konstruktor

    public BukuFiksi(String judul, String pengarang, String genre) {
        super(judul, pengarang);
        this.genre = genre;
    }
    
    //setter getter

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
