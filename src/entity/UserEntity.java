package entity;

public abstract class UserEntity {
    private String nama;
    private int id;

    public UserEntity(int id,String nama) {
        this.id = id;
        this.nama = nama;
    }

    public UserEntity() {
        
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

}