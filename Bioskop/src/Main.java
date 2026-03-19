public class Main {
    public static void main(String[] args) {
        System.out.println("-- SIMULASI BIOSKOP --");
        
        // Membuat Data Film dan Studio
        Film film1 = new Film("F-001", "Kaiju No. 8: The Movie", "Action/Sci-Fi", 120, 13);

        Studio studio1 = new Studio("S-001", "iMAX", 200);

        // Membuat Data jadwal Tayang dan Harga Tiket Bioskop dan ini juga otomatis membuat total 200 kursi tersedia (tipe Studio iMAX)
        JadwalTayang jadwalSiang = new JadwalTayang("JDW-01", "12.00 WIB", 50000, film1, studio1);

        // Customen Ingin Membeli Tiket
        Customer opank = new Customer("CUST-001", "OPANK", "opaw1426@gmail.com", "Opank1234", 250000, 20);

        // Kasir Membukan Menu Pesanan Baru untuk Customer Yang Ingin Memesan Tiket
        Transaksi transaksiOpank = new Transaksi("T-001", opank, 3);

        // Customer Memilih kursi Yang Terseddia 
        Kursi kursi1 = jadwalSiang.getDaftarKursi()[0];
        kursi1.setIsBooked(true);

        Kursi kursi2 = jadwalSiang.getDaftarKursi()[1];
        kursi2.setIsBooked(true);

        Kursi kursi3 = jadwalSiang.getDaftarKursi()[2];
        kursi3.setIsBooked(true);

        // Kasir Mencetak Tiket Yang Sudah Dipesan Oleh Customer
        Tiket tiket1 = new Tiket("TK-001", jadwalSiang, kursi1);
        Tiket tiket2 = new Tiket("TK-002", jadwalSiang, kursi2);
        Tiket tiket3 = new Tiket("TK-003", jadwalSiang, kursi3);

        // Tiket Dimasukkan Ke Dalam Keranjang Transaksi
        transaksiOpank.tambahTiket(tiket1);
        transaksiOpank.tambahTiket(tiket2);
        transaksiOpank.tambahTiket(tiket3);

        // Mencetak Struk Transasksi
        System.out.println("\n");
        transaksiOpank.printInfo();
    }
    
}
