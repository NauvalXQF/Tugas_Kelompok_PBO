public class Film {
    // atribut
    private String idFilm;
    private String judul;
    private String genre;
    private double durasiFilm;
    private int batasUmur;

    // konstruktor tanpa parameter
    public Film(){}

    // konstruktor dengan parameter
    public Film( String idFilm, String judul, String genre, double durasiFilm, int batasUmur){
        this.idFilm = idFilm;
        this.judul = judul;
        this.genre = genre;
        this.durasiFilm = durasiFilm;
        this.batasUmur = batasUmur;
    }

    // getter
    public String getIdFilm(){
        return idFilm;
    }

    public String getJudul(){
        return judul;
    }
    
    public String getGenre(){
        return genre;
    }

    public double getDurasiFilm(){
        return durasiFilm;
    }

    public int getBatasUmur(){
        return batasUmur;
    }

    // setter
    public void setIdFilm(String idFilm){
        this.idFilm = idFilm;
    }

    public void setJudul(String judul){
        this.judul = judul;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public void setDurasiFilm(double durasiFilm){
        this.durasiFilm = durasiFilm;
    }

    public void setBatasUmur(int batasUmur){
        this.batasUmur = batasUmur;
    }

    // method
    public void printInfo(){
        System.out.println("ID_Film: " + idFilm);
        System.out.println("Judul: " + judul);
        System.out.println("Genre: " + genre);
        System.out.println("Durasi (menit): " + durasiFilm);
        System.out.println("Batas Usia: " + batasUmur);
    }
}
