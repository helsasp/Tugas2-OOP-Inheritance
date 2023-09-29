package id.its.pbo.book;

public class PerpustakaanProgram {
    public static void main(String[] args) {
        
        BukuFiksi bukuFiksi1 = new BukuFiksi("It ends with us", "Jenny Han", "Romance");
        BukuPelajaran bukuPelajaran1 = new BukuPelajaran("Fisika Dasar", "Einstein", "Fisika");
        
        
        System.out.println("Informasi Buku Fiksi:");
        System.out.println("Judul: " + bukuFiksi1.getJudul());
        System.out.println("Pengarang: " + bukuFiksi1.getPengarang());
        System.out.println("Genre: " + bukuFiksi1.getGenre());

       
        System.out.println("\nInformasi Buku Pelajaran:");
        System.out.println("Judul: " + bukuPelajaran1.getJudul());
        System.out.println("Pengarang: " + bukuPelajaran1.getPengarang());
        System.out.println("Subjek: " + bukuPelajaran1.getSubjek());
    }
}



