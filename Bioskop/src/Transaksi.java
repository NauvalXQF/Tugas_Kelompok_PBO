public class Transaksi implements Pembayaran {
    // atribut
    private String idTransaksi;
    private Customer pembeli;
    private Tiket[] tiketDibeli;
    private int jumlahTiket;
    
    // konstruktor tanpa parameter
    public Transaksi(){}

    // konstruktor dengan parameter
    public Transaksi(String idTransaksi, Customer pembeli, int maksimalTiket){
        this.idTransaksi = idTransaksi;
        this.pembeli = pembeli;
        this.tiketDibeli = new Tiket[maksimalTiket];
        this.jumlahTiket = 0;
    }

    // getter
    public String getIdTransaksi(){
        return idTransaksi;
    }
    
    public Customer getPembeli(){
        return pembeli;
    }

    public Tiket[] getTiketDibeli(){
        return tiketDibeli;
    }

    public int getJumlahTiket(){
        return jumlahTiket;
    }

    // setter
    public void setIdTransaksi(String idTransaksi){
        this.idTransaksi = idTransaksi;
    }

    public void setPembeli(Customer pembeli){
        this.pembeli = pembeli;
    }

    public void setTiketDibeli(Tiket[] tiketDibeli){
        this.tiketDibeli = tiketDibeli;
    }

    public void setJumlahTiket(int jumlahTiket){
        this.jumlahTiket = jumlahTiket;
    }

    // method
    public void tambahTiket(Tiket tiketBaru){
        if (jumlahTiket < tiketDibeli.length){
            tiketDibeli[jumlahTiket] = tiketBaru;
            jumlahTiket++;
        } else{
            System.out.println("Maaf, Tiket HABIS!!!");
        }
    }

    // implementasi method interface
    @Override
    public double hitungTotalBayar(){
        double total = 0;
        for (int i = 0; i < jumlahTiket; i++){
            total += tiketDibeli[i].getJadwal().getHarga();
        } 
        return total;
    }

    // method cetak struk
    public void printInfo(){
        System.out.println("-- STRUK TRANSAKSI BIOSKOP --\n");
        System.out.println("ID_Transaksi: " + idTransaksi);

        System.out.println("Nama Pembeli: " + pembeli.getNama());

        System.out.println("-- DAFTAR TIKET YANG DIPESAN --\n");
        for(int i = 0; i < jumlahTiket; i++){
            tiketDibeli[i].printInfo();
            System.out.println("--------------------------");
        }

        System.out.println("Total Bayar: Rp" + hitungTotalBayar());
        System.out.println("--------------------------");
    }

}
