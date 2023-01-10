package entity;

public class TransaksiEntity {
    private BarangEntity barang;
    private int harga;
    private int totalHarga;

    public TransaksiEntity(BarangEntity barang, int harga) {
        this.barang = barang;
        this.harga = harga;
    }

    public TransaksiEntity() {
    }

    public BarangEntity getBarang() {
        return this.barang;
    }

    public void setBarang(BarangEntity barang) {
        this.barang = barang;
    }

    public int getHarga() {
        return this.harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getTotalHarga() {
        return this.totalHarga*this.harga;
    }

    public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }
}