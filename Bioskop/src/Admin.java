public class Admin extends User {
    // atribut
    private String idStaff;

    // konstruktor tanpa parameter
    public Admin(){
        super();
    }

    // konstruktor dengan parameter
    public Admin(String idUser, String nama, String email, String password, String idStaff){
        super(idUser, nama, email, password);
        this.idStaff = idStaff;
    }

    // getter
    public String getIdStaff(){
        return idStaff;
    }

    // setter
    public void setIdStaff(String idStaff){
        this.idStaff = idStaff;
    }

    // implementasi method
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Id_Staff: " + idStaff);
    }

    // implementasi method abstract
    @Override
    public void showMenu(){
        System.out.println("-- ADMIN MENU --");
        System.out.println("1. Add Film");
        System.out.println("2. Atur Jadwal Tayang");
        System.out.println("0. Logout");
    }
    
}
