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

    // method dengan try-catch (versi lama DIHAPUS)
     public void tambahTiket(Tiket tiketBaru) {
        try {
          
            if (tiketBaru == null) {
                throw new IllegalArgumentException("Tiket tidak boleh null!");
            }
             if (jumlahTiket > tiketDibeli.length) {

                throw new ArrayIndexOutOfBoundsException("Kapasitas transaksi penuh! Maksimal: " + tiketDibeli.length);
            }
            if (!tiketBaru.getKursi().getIsBooked()) {
                throw new IllegalStateException("Kursi " + tiketBaru.getKursi().getNoKursi() + " belum di-booking!");
            }
           
            int low = 0;
            int high = jumlahTiket-1;
            int posisiInput = jumlahTiket;

            while(low <= high){
                int mid = low + (high - low) / 2;
                String idMid = tiketDibeli[mid].getIdTiket();
                String idBaru = tiketBaru.getIdTiket();

                int hasilBanding = idMid.compareTo(idBaru);
                if (hasilBanding == 0) {
                    throw new IllegalArgumentException(idBaru + " sudah exist!");
                }
                if (hasilBanding < 0) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                    posisiInput = mid;
                }
            }

            for (int i = jumlahTiket; i > posisiInput; i--) {
                tiketDibeli[i] = tiketDibeli[i - 1];
            }
            
            tiketDibeli[posisiInput] = tiketBaru;
            jumlahTiket++;
            System.out.println("[OK] Tiket " + tiketBaru.getIdTiket() + " berhasil ditambahkan.");

        } catch (Exception e) { 
             System.out.println("[ERROR] " + e.getMessage());
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

    //proses pembayaran
     public void prosesPembayaran() {
        double total = hitungTotalBayar();
        if (pembeli.getSaldo() < total) {
            System.out.println("[FAILED] Saldo kurang Rp" + (total - pembeli.getSaldo()));
        } else {
            pembeli.setSaldo(pembeli.getSaldo() - total);
            System.out.println("[SUCCESS] Pembayaran berhasil. Sisa saldo: Rp" + pembeli.getSaldo());
         }
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
