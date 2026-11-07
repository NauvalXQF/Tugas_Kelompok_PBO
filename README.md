# Tugas Kelompok PBO — Cinema Ticket Booking (Java)

Group project for the Object-Oriented Programming course: a Java cinema ticket booking system.

## Project: Bioskop

The [`Bioskop`](Bioskop) folder contains a Java application covering the core cinema domain:

- **Users** — admin and customer roles
- **Films & schedules** — movie data and showtimes
- **Studios & seats** — seat selection per studio
- **Transactions** — ticket booking and payment records

Class layout: `User`, `Admin`, `Customer`, `Film`, `JadwalTayang` (schedule), `Studio`, `Kursi` (seat), `Tiket` (ticket), `Pembayaran` (payment), `Transaksi` (transaction), plus `Main`.

## Running

```bash
cd Bioskop/src
javac Main.java
java Main
```

Or open the folder in an IDE and run `Main`.

## Notes

Academic group project. The compiled `.class` files included in `src/` are leftovers — rebuilding from source is recommended.
