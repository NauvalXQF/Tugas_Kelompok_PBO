public class Main {
    public static void main(String[] args) {
        System.out.println("-- SIMULASI BIOSKOP --");

        try {
            // Membuat Data Film dan Studio
            Film film1 = new Film("F-001", "Kaiju No. 8: The Movie", "Action/Sci-Fi", 120, 13);
            Studio studio1 = new Studio("S-001", "iMAX", 200);
            JadwalTayang jadwalSiang = new JadwalTayang("JDW-01", "12.00 WIB", 50000, film1, studio1);

            // Customer
            Customer opank = new Customer("CUST-001", "OPANK", "opaw1426@gmail.com", "Opank1234", 250000, 20);

            // Validasi saldo sebelum transaksi
            int jumlahBeli = 3;
            double totalEstimasi = jadwalSiang.getHarga() * jumlahBeli;

            if (opank.getSaldo() < totalEstimasi) {
                throw new IllegalStateException(
                    "Saldo tidak cukup! Saldo: " + opank.getSaldo() + ", Dibutuhkan: " + totalEstimasi
                );
            }

            // Transaksi
            Transaksi transaksiOpank = new Transaksi("T-001", opank, jumlahBeli);

            // Booking kursi
            Kursi[] kursiDipilih = new Kursi[jumlahBeli];
            for (int i = 0; i < jumlahBeli; i++) {
                kursiDipilih[i] = jadwalSiang.getDaftarKursi()[i];

                if (kursiDipilih[i].getIsBooked()) {
                    throw new IllegalStateException("Kursi K-" + (i+1) + " sudah dipesan orang lain!");
                }
                kursiDipilih[i].setIsBooked(true);
            }

            // Buat dan tambah tiket
            for (int i = 0; i < jumlahBeli; i++) {
                Tiket tiket = new Tiket("TK-00" + (i+1), jadwalSiang, kursiDipilih[i]);
                transaksiOpank.tambahTiket(tiket);
            }

            // Cetak struk
            System.out.println("\n");
            transaksiOpank.printInfo();

        } catch (IllegalStateException e) {
            System.out.println("[TRANSAKSI GAGAL] " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("[ERROR SISTEM] Index kursi out of bounds: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("[ERROR SISTEM] Objek null terdeteksi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("[ERROR TIDAK TERDUGA] " + e.getMessage());
        } finally {
            System.out.println("\n-- SESI SIMULASI SELESAI --");
        }
    }
}