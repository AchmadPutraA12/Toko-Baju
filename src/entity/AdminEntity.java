package entity;

public class AdminEntity extends UserEntity{
    private String password;

    public AdminEntity(int id, String nama, String password) {
        super(id, nama);
        this.password = password;
    }

    public AdminEntity() {
    
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
