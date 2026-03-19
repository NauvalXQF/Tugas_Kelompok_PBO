public class Kursi {
    // atribut
    private String noKursi;
    private boolean isBooked;

    // konstruktor tanpa parameter
    public Kursi(){}

    // konstruktor dengan parameter
    public Kursi(String noKursi){
        this.noKursi = noKursi;
        this.isBooked = false;
    }
    
    // getter
    public String getNoKursi(){
        return noKursi;
    }

    public boolean getIsBooked(){
        return isBooked;
    }

    // setter
    public void setNoKursi(String noKursi){
        this.noKursi = noKursi;
    }

    public void setIsBooked(boolean isBooked){
        this.isBooked = isBooked;
    }

    // method
    public void printInfo(){
        System.out.println("Nomor Kursi: " + noKursi);
        if (this.isBooked){
            System.out.println("Status: Booked");
        } else{
            System.out.println("Status: Available");
        }
    }
}
