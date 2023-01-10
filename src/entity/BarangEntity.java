package entity;

public class BarangEntity {
    private String jenisBaju;
    private String bahan;

    public BarangEntity(String jenisBaju, String bahan) {
        this.jenisBaju = jenisBaju;
        this.bahan = bahan;
    }

    public String getJenisBaju() {
        return this.jenisBaju;
    }

    public void setJenisBaju(String jenisBaju) {
        this.jenisBaju = jenisBaju;
    }

    public String getBahan() {
        return this.bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }
}