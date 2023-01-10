package controller;

import entity.PengunjungEntity;
import entity.TransaksiEntity;
import model.DataBajuModel;
import model.DetailTransaksi;

import view.DetailTransaksiView;
import view.TransaksiView;
import view.MenuTransaksi;

public class DetailTransaksiController {

    public void menuDataToAmin(){
        MenuTransaksi menuTransaksi = new MenuTransaksi();
        menuTransaksi.menuData();
    }

    public void inputToMenu(){
        DetailTransaksiView dataTransaksiView = new DetailTransaksiView();
        dataTransaksiView.inputBeli();
    }

    public void displayTtoMenu(){
        TransaksiView transaksiView = new TransaksiView();
        transaksiView.display();
    }

    public void displayDtoMenu(){
        DetailTransaksiView dataTransaksiView = new DetailTransaksiView();
        dataTransaksiView.display();
    }

    public boolean cari(String jenis){
        TransaksiEntity transaksi = DataBajuModel.cari(jenis);
        if(transaksi!=null){
            return true;
        }
        else{
            return false;
        }
    }

    public void beli(int id, String nama,String alamat,TransaksiEntity transaksi){
        DetailTransaksi.beli(new PengunjungEntity( id, nama, alamat), transaksi);
    }
}