package entity;

import utils.Date;

public class DetailTransaksiEntity {
    private PengunjungEntity pengunjung;
    private TransaksiEntity transaksi;
    private String tanggal;

    public DetailTransaksiEntity(PengunjungEntity pengunjung, TransaksiEntity transaksi) {
        this.pengunjung = pengunjung;
        this.transaksi = transaksi;
        this.tanggal = Date.now();
    }

    public PengunjungEntity getPengunjung() {
        return this.pengunjung;
    }

    public void setPengunjung(PengunjungEntity pengunjung) {
        this.pengunjung = pengunjung;
    }

    public TransaksiEntity getTransaksi() {
        return this.transaksi;
    }

    public void setTransaksi(TransaksiEntity transaksi) {
        this.transaksi = transaksi;
    }


    public String getTanggal() {
        return this.tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

}