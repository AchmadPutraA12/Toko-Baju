package view;

import entity.TransaksiEntity;
import model.DataBajuModel;

public class TransaksiView {

    public void display(){
        for (TransaksiEntity transaksiEntity : DataBajuModel.all()) {
            System.out.println("============================================");
            System.out.println("Jenis Baju  = " + transaksiEntity.getBarang().getJenisBaju());
            System.out.println("Bahan Baju  = " + transaksiEntity.getBarang().getBahan());
            System.out.println("Harga Baju  = " + transaksiEntity.getHarga());
            System.out.println("============================================");
        }  
    }
}