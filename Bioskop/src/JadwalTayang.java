public class JadwalTayang {
    // atribut 
    private String idJadwal;
    private String waktuTayang;
    private double harga;
    private Film filmTayang;
    private Studio studioPilihan;
    private Kursi[] daftarKursi;

    // konstruktor tanpa parameter
    public JadwalTayang(){}

    // konstruktor dengan parameter
    public JadwalTayang(String idJadwal, String waktuTayang, double harga, Film filmTayang, Studio studioPilihan){
        this.idJadwal = idJadwal;
        this.waktuTayang = waktuTayang;
        this.harga = harga;
        this.filmTayang = filmTayang;
        this.studioPilihan = studioPilihan;
        
        // insiasi untuk class kursi dalam satu studio
        int kapasitas = studioPilihan.getKapasitas();
        this.daftarKursi = new Kursi[kapasitas];

        for (int i = 0; i < kapasitas; i++){
            this.daftarKursi[i] = new Kursi("K-" + (i + 1));
        }
       
    }
    // getter
    public String getIdJadwal(){
        return idJadwal;
    }

    public String getWaktuTayang(){
        return waktuTayang;
    }

    public double getHarga(){
        return harga;
    }

    public Film getFilmTayang(){
        return filmTayang;
    }

    public Studio getStudioPilihan(){
        return studioPilihan;
    }

    public Kursi[] getDaftarKursi(){
        return daftarKursi;
    }
    
    // setter
    public void setIdJadwal(String idJadwal){
        this.idJadwal = idJadwal;
    }

    public void setWaktuTayang(String waktuTayang){
        this.waktuTayang = waktuTayang;
    }

    public void setHarga(double harga){
        this.harga = harga;
    }

    public void setFilmTayang(Film filmTayang){
        this.filmTayang = filmTayang;
    }

    public void setStudioPilihan(Studio studioPilihan){
        this.studioPilihan = studioPilihan;
    }

    public void setDaftarKursi(Kursi[] daftarKursi){
        this.daftarKursi = daftarKursi;
    }

    // method
    public void printInfo(){
        System.out.println("ID_Jadwal: " + idJadwal);
        System.out.println("Waktu: " + waktuTayang);
        System.out.println("Harga: " + harga);
        System.out.println("Judul Film: " + filmTayang.getJudul());
        System.out.println("Tipe Studio: " + studioPilihan.getTipeStudio());
    }
}
            