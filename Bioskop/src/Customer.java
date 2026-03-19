public class Customer extends User{
    // atribut
    private double saldo;


    //konstruktor tanpa parameter
    public Customer(){
        super();
    }

    // konstruktor dengan parameter
    public Customer(String idUser, String nama, String email, String password, double saldo){
        super(idUser, nama, email, password);
        this.saldo = saldo;
    }

    // getter
    public double getSaldo(){
        return saldo;
    }

    public int getUmur(){
        return umur;
    }

    // setter
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }


    // implementasi method
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Saldo: " + saldo);
    }
    
    // implementasi method abstract
    @Override
    public void showMenu(){
        System.out.println("-- CUSTOMER MENU --");
        System.out.println("1. Daftar Film Tayang");
        System.out.println("2. Pesan Tiket");
        System.out.println("3. Lihat Tiket Saya");
        System.out.println("4. Top Up Saldo");
        System.out.println("0. Logout");
    }
}
