package view;

import entity.TransaksiEntity;
import entity.DetailTransaksiEntity;
import model.DataBajuModel;
import model.DetailTransaksi;
import controller.DetailTransaksiController;

import java.util.Scanner;


public class DetailTransaksiView implements InterfaceView{
    Scanner input = new Scanner(System.in);
    DetailTransaksiController data = new DetailTransaksiController();

    @Override
    public void inputBeli(){
        int id;
        String nama,alamat;
        try{
            System.out.println();
            System.out.print("Masukkan Id Pembeli           = ");
            id = input.nextInt();
            input.nextLine();
            System.out.print("Masukkan Atas Nama Pembeli    = ");
            nama = input.nextLine();
            System.out.print("Masukkan Alamat Pembeli       = ");
            alamat = input.nextLine();
            
            TransaksiEntity objekTransaksi = pilihBaju();
            data.beli(id, nama, alamat, objekTransaksi);
            System.out.println("Data Berhasil Masuk");
        }catch(Exception e){
            System.out.println("Data Tidak Masuk");
        }
        
    }

    private TransaksiEntity pilihBaju(){
        boolean pilih = false;
        String jenis;
        TransaksiEntity transaksi;

        do {
            System.out.print("Masukkan Jenis  = ");
            jenis = input.nextLine();
            transaksi = DataBajuModel.cari(jenis);
            if (transaksi!=null) {
                char pilihBukuIni = 'n';

                System.out.println();
                System.out.println("Jenis Baju  = " + transaksi.getBarang().getJenisBaju());
                System.out.println("Bahan Baju  = " + transaksi.getBarang().getBahan());
                System.out.println("Harga Baju  = " + transaksi.getHarga());

                System.out.print("  Pilih Baju ini (y/n) : ");
                pilihBukuIni = input.nextLine().charAt(0);

                if (pilihBukuIni == 'y') {
                    pilih = true;
                    System.out.print("Masukkan Jumlah Baju Yang dibeli = ");
                    int harga = input.nextInt();
                    input.nextLine();
                    transaksi.setTotalHarga(harga);
                    break;
                }
            } else {
                System.out.println("------------ Data Tidak Ditemukan -----------");
            }
        } while (pilih == false);

        return transaksi;
    }

    @Override
    public void display(){
        for (DetailTransaksiEntity dataTransaksi : DetailTransaksi.all()) {
            System.out.println();
            System.out.println("=============================================");
            System.out.println("Nama Pembeli            = " + dataTransaksi.getPengunjung().getNama());
            System.out.println("Alamat Pembeli          = " + dataTransaksi.getPengunjung().getAlamat());
            System.out.println("Jenis Baju yang dibeli  = " + dataTransaksi.getTransaksi().getBarang().getJenisBaju());
            System.out.println("Bahan Baju yang dibeli  = " + dataTransaksi.getTransaksi().getBarang().getBahan());
            System.out.println("Tanggal Beli            = " + dataTransaksi.getTanggal());
            System.out.println("Total Harga             = " + dataTransaksi.getTransaksi().getTotalHarga());
            System.out.println("=============================================");
            System.out.println();
        }
    }
}
