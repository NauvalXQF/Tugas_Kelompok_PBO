public class Studio { 
    // atribut
    private String idStudio;
    private String tipeStudio;
    private int kapasitas;

    // konstruktor tanpa parameter
    public Studio(){}

    // konstruktor dengan parameter
    public Studio(String idStudio, String tipeStudio, int kapasitas){
        this.idStudio = idStudio;
        this.tipeStudio = tipeStudio;
        this.kapasitas = kapasitas;
    }

    // getter
    public String getIdStudio(){
        return idStudio;
    }

    public String getTipeStudio(){
        return tipeStudio;
    }

    public int getKapasitas(){
        return kapasitas;
    }

    // setter
    public void setIdStudio(String idStudio){
        this.idStudio = idStudio;
    }

    public void setTipeStudio(String tipeStudio){
        this.tipeStudio = tipeStudio;
    }

    public void setKapasitas(int kapasitas){
        this.kapasitas = kapasitas;
    }

    // method
    public void printInfo(){
        System.out.println("Studio: " + idStudio);
        System.out.println("Tipe: " + tipeStudio);
        System.out.println("Kapasitas: " + kapasitas);
    }
    
}
