package entity;

public class PengunjungEntity extends UserEntity {
    private String alamat;

    public PengunjungEntity(int id,String nama, String alamat){
        super(id, nama);
        this.alamat = alamat;
    }

    public PengunjungEntity() {

    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }   
}