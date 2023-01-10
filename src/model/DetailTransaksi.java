package model;
import java.util.Scanner;
import java.util.ArrayList;

import entity.TransaksiEntity;
import entity.PengunjungEntity;
import entity.DetailTransaksiEntity;

public class DetailTransaksi {
    static ArrayList<DetailTransaksiEntity> arrayData = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void beli(PengunjungEntity pengunjung, TransaksiEntity transaksi){
        arrayData.add(new DetailTransaksiEntity(pengunjung, transaksi));
    }

    public static ArrayList<DetailTransaksiEntity> all(){
        return arrayData;
    }
}