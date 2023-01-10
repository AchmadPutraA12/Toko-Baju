package model;
import java.util.ArrayList;
import java.util.Scanner;

import entity.BarangEntity;
import entity.TransaksiEntity;

public class DataBajuModel {
    static Scanner input = new Scanner(System.in);
    static ArrayList<TransaksiEntity> arrayTransaksi = new ArrayList<>();
    static TransaksiEntity objTransaksi = new TransaksiEntity();

    public static void dataBarang(){
        arrayTransaksi.add(new TransaksiEntity(new BarangEntity("kemeja", "katun"), 500000));
        arrayTransaksi.add(new TransaksiEntity(new BarangEntity("oblong", "katun"), 900000));
        arrayTransaksi.add(new TransaksiEntity(new BarangEntity("daster", "Kain"), 10000));
        arrayTransaksi.add(new TransaksiEntity(new BarangEntity("kaos", "kain"), 20000));
    }

    public static TransaksiEntity cari(String jenis){
        for(TransaksiEntity objectTransaksi : arrayTransaksi){
            if(objectTransaksi.getBarang().getJenisBaju().equals(jenis)){
                return objectTransaksi;
            }
        }
        return null;
    }

    public static ArrayList<TransaksiEntity> all(){
        return arrayTransaksi;
    } 
}