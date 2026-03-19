public abstract class User{
    // atribut
    private String idUser;
    private String nama; 
    private String email;
    private String password;

    //konstruktor tanpa parameter
    public User(){}

    // konstruktor dengan parameter
    public User(String idUser, String nama, String email, String password){
        this.idUser = idUser;
        this.nama = nama;
        this.email = email;
        this.password = password;
    }

    // getter 
    public String getIdUser(){
        return idUser;
    }

    public String getNama(){
        return nama;
    }
    
    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    // setter
    public void setIdUser(String idUser){
        this.idUser = idUser;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String password){
        this.password = password;
    }

    // method 
    public boolean login (String inputEmail, String inputPassword){
        return this.email.equals(inputEmail) && this.password.equals(inputPassword);
    }

    public void printInfo(){
        System.out.println("ID: " + idUser);
        System.out.println("NAMA: " + nama);
        System.out.println("EMAIL: " + email);
    }

    // method abstract
    public abstract void showMenu();
}
