package view;

import controller.AdminController;
import controller.DetailTransaksiController;

import java.util.Scanner;

public class AdminView {
    Scanner input = new Scanner(System.in);
    AdminController admin = new AdminController();

    public void login(){
        int id;
        String password;
        try{
            System.out.print("Masukkan id       = ");
            id = input.nextInt();
            input.nextLine();
            System.out.print("Masukkan Password = ");
            password = input.nextLine();
            boolean status = admin.cari(id, password);
            if(status){
                DetailTransaksiController dataTransaksiController = new DetailTransaksiController();
                dataTransaksiController.menuDataToAmin();
            }
            else{
                System.out.println("Data tidak Ada");
            }
        }catch(Exception e){
            System.out.println(e);
            System.out.println("GAGAL LOGIN");
        }
    }
}