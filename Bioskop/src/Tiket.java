public class Tiket {
    // atribut 
    private String idTiket;
    private JadwalTayang jadwal;
    private Kursi kursi;

    // konstruktor tanpa parameter
    public Tiket(){}

    // konstruktor dengan parameter
    public Tiket(String idTiket, JadwalTayang jadwal, Kursi kursi){
        this.idTiket = idTiket;
        this.jadwal = jadwal;
        this.kursi = kursi;
    }
    
    //getter
    public String getIdTiket(){
        return idTiket;
    }

    public JadwalTayang getJadwal(){
        return jadwal;
    }

    public Kursi getKursi(){
        return kursi;
    }

    // setter
    public void setIdTiket(String idTiket){
        this.idTiket = idTiket;
    }

    public void setJadwal(JadwalTayang jadwal){
        this.jadwal = jadwal;
    }

    public void setKursi(Kursi kursi){
        this.kursi = kursi;
    }

    // method 
    public void printInfo(){
        System.out.println("ID_Tiket: " + idTiket);
        System.out.println("Judul Film: " + jadwal.getFilmTayang().getJudul());
        System.out.println("Waktu Tayang: " + jadwal.getWaktuTayang());
        System.out.println("Nomor Kursi: " + kursi.getNoKursi());
    }
}
